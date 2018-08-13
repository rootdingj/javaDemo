package com.xml.parser.test;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jParser {

	public static void main(String[] args) throws Exception {
		String path = "src/com/xml/parser/test/test2.xml";
		SAXReader reader = new SAXReader();
		Document document = reader.read(path);
		Element root = document.getRootElement();
		System.out.println("<?xml version='1.0' encoding='utf-8'?>");
		iteratorNode(root);
	}

	private static void iteratorNode(Element e) {
		String name = e.getName();
		System.out.print("<"+name);
		@SuppressWarnings("unchecked")
		List<Attribute> attributes = e.attributes();
		for(Attribute attr:attributes){
			System.out.print("\t"+attr.getName()+"='"+attr.getValue()+"'");
		}
		System.out.println(">");
		System.out.println(e.getText().trim());
		
		@SuppressWarnings("unchecked")
		List<Element> elements = e.elements();
		if(!(elements.isEmpty())){
			
		}
		System.out.println("</"+name+">");
	}
}
