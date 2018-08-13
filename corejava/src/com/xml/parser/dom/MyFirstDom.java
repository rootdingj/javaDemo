package com.xml.parser.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class MyFirstDom {

	public static void main(String[] args) throws Exception {
		
		//指定xml文件生成路径
		String path = "src/com/xml/parser/dom/test1.xml";
		createXML(path);
//		readXML(path);
	}
	
	//创建xml文件
	private static void createXML(String path) throws Exception {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		//声明一个树形结构
		//创建一个document类型的节点对象
		Document document = db.newDocument();
		
		//I、在内存中创建了树形结构
		createTree(document);
		
		//II、把属性结构转换成文件
		//使用转换器
		TransformerFactory tff = TransformerFactory.newInstance();
		Transformer transformer = tff.newTransformer();
		//构建transform()的两个参数
		//1、树形结构的Source对象
		  DOMSource source = new DOMSource(document);
		//2、代表生成xml文档的Result对象
		 StreamResult result = new StreamResult(path);
		
		//可以帮助控制xml格式，过滤空白的文本节点
		//为transformer对象设置参数
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(source, result);
		
	}
	
	//封装创建节点的过程
	private static void createTree(Document document) {
		//dom解析创建树形结构的步骤：
		//1、把所有树形结构中的节点创建出来
		//创建根元素
		Element root = document.createElement("employees");
		//子元素
		Element childElement = document.createElement("employee");
		//属性
		Attr attr = document.createAttribute("age");
		//文本
		Text text = document.createTextNode("lisi");
		
		//2、把节点和节点之间的联系建立起来(从下到上,调换一下顺序有没有问题？)
		//用appendChild()为节点添加子节点
		childElement.appendChild(text);
		//为属性添加子节点
		//dom解析创建属性节点的同时不会创建属性值
		childElement.setAttributeNode(attr);
		//
		root.appendChild(childElement);
		//把包括根节点在内属性结构放入document节点中
		document.appendChild(root);
		
	}
	
	//解析创建出来的xml文档
	private static void readXML(String path) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(path);
		//查看对应节点元素的名字
		//获取根节点
		//要拿到某一个节点必须拿到同一层次的所有节点，再遍历(麻烦)
		NodeList nodes = document.getChildNodes();
		//根节点只有一个，通过下标获得
		Node root = nodes.item(0);
		//getLocalName():换行空格显示 null
		//getNodeName():..........#Text
		System.out.println("根节点的名称："+root.getNodeName());
		//得到根节点下的子节点，遍历
		NodeList childNodes = root.getChildNodes();
		for(int i=0;i<childNodes.getLength();i++){
			Node node = childNodes.item(i);
			System.out.println("子节点的名称"+node.getNodeName());
			//获得子节点的属性,如果有多个也要遍历拿出来，类似map
			NamedNodeMap attributes = node.getAttributes();
			//判断节点的属性是否为空
			if(attributes!=null){
				Node attri = attributes.item(0);
				System.out.println("属性名"+attri.getNodeName());
				System.out.println("属性值"+attri.getNodeValue());
			}
			//判断节点的文本是否为空N
			if(!(node.getNodeName().equals("#text"))){
				NodeList childNodes2 = node.getChildNodes();
				Node text = childNodes2.item(0);
				System.out.println("文本内容"+text.getTextContent());
			}
		}
	}
}
