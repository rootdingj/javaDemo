package com.xml.parser.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParser {

	public static void main(String[] args) throws Exception {
		String path = "src/com/xml/parser/test/test2.xml";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(path);
		System.out.println("<?xml version='1.0' encoding='utf-8'?>");
		NodeList childNodes = document.getChildNodes();
		iteratorNode(childNodes);
	}

	private static void iteratorNode(NodeList childNodes) {
		for(int i=0;i<childNodes.getLength();i++){
			Node item = childNodes.item(i);
			String nodeName = item.getNodeName();
			if(nodeName.equals("#text")){
				System.out.println(item.getTextContent().trim());
//				System.out.println(item.getTextContent());
				continue;
			}
			System.out.print("<"+nodeName);
			NamedNodeMap attributes = item.getAttributes();
			if(attributes!=null){
				for(int j=0;j<attributes.getLength();j++){
					System.out.print("\t");
					Node attr = attributes.item(j);
					System.out.print(attr.getNodeName()+"='"+attr.getNodeValue()+"'");
				}
			}
			System.out.println(">");
			if(item.hasChildNodes()){
				iteratorNode(item.getChildNodes());
			}
			System.out.println("</"+nodeName+">");
		}
	}
}
