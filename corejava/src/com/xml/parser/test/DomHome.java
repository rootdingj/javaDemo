package com.xml.parser.test;

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

public class DomHome {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		String path1 = "src/com/xml/parser/test/test2.xml";
		String path2 = "src/com/xml/parser/test/test1.xml";
//		createXML(path1);
		readXML(path2);
	}
	
	@SuppressWarnings("unused")
	private static void createXML(String path1) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document document = builder.newDocument();
		createTree(document);
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer tf = factory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(path1);
		tf.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		tf.setOutputProperty(OutputKeys.INDENT,"yes");
		tf.transform(source, result);
	}

	private static void createTree(Document document) {
		Element root = document.createElement("briup");
		Attr briupAtt = document.createAttribute("postion");
		briupAtt.setValue("昆山浦东软件园");
		Element child1 = document.createElement("ceo");
		Attr childAtt1 = document.createAttribute("gender");
		childAtt1.setValue("male");
		Text ceoText = document.createTextNode("larry");
		
		Element child2 = document.createElement("cfo");
		Attr childAtt2 = document.createAttribute("gender");
		childAtt2.setValue("female");
		Text cfoText = document.createTextNode("xue");
		
		Element child3 = document.createElement("cto");
		Attr childAtt3 = document.createAttribute("gender");
		childAtt3.setValue("male");
		Text ctoText = document.createTextNode("kiven");
		child1.appendChild(ceoText);
		child2.appendChild(cfoText);
		child3.appendChild(ctoText);
		child1.setAttributeNode(childAtt1);
		child2.setAttributeNode(childAtt2);
		child3.setAttributeNode(childAtt3);
		root.setAttributeNode(briupAtt);
		root.appendChild(child1);
		root.appendChild(child2);
		root.appendChild(child3);
		document.appendChild(root);
	}

	private static void readXML(String path2) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document document = builder.parse(path2);
		NodeList nodes = document.getChildNodes();
		Node root = nodes.item(0);
		System.out.println(root.getNodeName());
		NamedNodeMap attroot = root.getAttributes();
		if(attroot!=null){
			Node aroot = attroot.item(0);
			System.out.println("根节点的属性名:"+aroot.getNodeName());
			System.out.println("根节点的属性值:"+aroot.getNodeValue());
		}
		//二级节点
		NodeList childNodes = root.getChildNodes();
		for(int i=0;i<childNodes.getLength();i++){
			Node childNode = childNodes.item(i);
			if(!(childNode.getNodeName().equals("#text"))){
				System.out.println("次级节点为:"+childNode.getNodeName());
			}
			//三级节点
			NodeList thrchildNodes = childNode.getChildNodes();
			for(int j=0;j<thrchildNodes.getLength();j++){
				Node thrchildNode = thrchildNodes.item(j);
				if(!(thrchildNode.getNodeName().equals("#text"))){
					System.out.println("三级节点为:"+thrchildNode.getNodeName());
				}
				NamedNodeMap attThr = thrchildNode.getAttributes();
				if(attThr!=null){
					Node athr = attThr.item(0);
					System.out.println("三级节点的属性名为："+athr.getNodeName());
					System.out.println("三级节点的属性值为："+athr.getNodeValue());
				}
				//四级节点
				NodeList fourchildNodes = thrchildNode.getChildNodes();
				for(int k=0;k<fourchildNodes.getLength();k++){
					Node fNode = fourchildNodes.item(k);
					if(!(fNode.getNodeName().equals("#text"))){
						System.out.println("四级节点为:"+fNode.getNodeName());
					}
					NamedNodeMap attfs = fNode.getAttributes();
					if(attfs!=null&&attfs.getLength()!=0){
						Node attf = attfs.item(0);
						Node attf1 = attfs.item(1);
						
						System.out.println(attf.getNodeName());
						System.out.println(attf.getNodeValue());
						System.out.println(attf1.getNodeName());
						System.out.println(attf1.getNodeValue());
					}
					if(!(fNode.getChildNodes().equals("#text"))){
						System.out.println("文本内容为:"+fNode.getTextContent());
//						fNode.getTextContent().trim().equals("")
					}
				}
			}
		}
	}
}
