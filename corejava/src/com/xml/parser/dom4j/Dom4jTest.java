package com.xml.parser.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jTest {

	public static void main(String[] args) throws Exception {
		//指定xml文件生成路径
		String path = "src/com/xml/parser/dom4j/test2.xml";
//		createXML(path);
		readXML(path);
	}

	private static void createXML(String path) throws Exception{
		//1、创建树形结构
		//dom4j不用创建document节点(和dom的不同之处)
		//dom4j在创建节点的同时就把节点间的联系建立起来
		//创建文档及设置根元素节点的方式
		Element root = DocumentHelper.createElement("student");
		Document document = DocumentHelper.createDocument(root);
		//给根节点添加属性
		root.addAttribute("school", "江西理工").addAttribute("position", "江西");
		//给根节点添加子节点
		//返回值就是子节点
		Element element1 = root.addElement("student");
		element1.addElement("name").addAttribute("gender", "male").addText("丁进");
		element1.addElement("age").addText("22");
		
		//2、转化成xml文件
		//把生成的xml文件存放在硬盘上,true代表是否换行
		OutputFormat format = new OutputFormat("        ", true);
		//设置编码
		format.setEncoding("utf-8");
		
		XMLWriter xmlwriter = new XMLWriter(new FileOutputStream(path), format);
		xmlwriter.write(document);
		xmlwriter.close();
		
	}
	
	@SuppressWarnings("unchecked")
	private static void readXML(String path) throws Exception {
		//1、拿到解析对象，直接new,为了与框架融合(和dom的不同之处)
		SAXReader reader = new SAXReader();
		//2、解析文件
		Document document = reader.read(path);
		//3、拿到根节点
		Element root = document.getRootElement();
		System.out.println("根节点名称"+root.getName());
		
		//4、获得所有根节点下的子节点
		List<Element> childern = root.elements();
		for(Element child:childern){
			System.out.println("子节点名称"+child.getName());
			//拿到name age 两个子节点
			List<Element> sanOfSans = child.elements();
			
			//第一次循环拿到的是name子节点
			//遍历name子节点的属性
			for(Element sanOfSan: sanOfSans){ 
				
				System.out.println("次级根节点有："+sanOfSan.getName());
				System.out.println("文本内容为:"+sanOfSan.getText());
				List<Attribute> attributes = sanOfSan.attributes();
				//第二次是遍历name节点的所有属性值
				for(Attribute att:attributes){
					System.out.println("属性名"+att.getName());
					System.out.println("属性值"+att.getValue());
				}
			}
	     }
		
		/*dom4j也可以根据标签名直接拿到某个节点
		 * root.element("student");
		 * 默认过滤掉空白的文本节点
		 * */
    }
}
