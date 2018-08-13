package com.xml.parser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParser {
	public static void main(String[] args) throws Exception {
		
		String path = "";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document document = builder.parse(path);
		
		System.out.println("<?xml version='1.0' encoding='utf-8'?>");
		NodeList nodes = document.getChildNodes();
		iteratorNodes(nodes);
		
	}

	private static void iteratorNodes(NodeList nodes) {
		for(int i=0;i<nodes.getLength();i++){
			Node node = nodes.item(0);
			String nodeName = node.getNodeName();
			if(nodeName.equals("#text")){
				System.out.println(node.getTextContent().trim());
				continue;
			}
		}
		
	}
}
