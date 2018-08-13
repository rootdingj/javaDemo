package com.xml.parser.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class SaxParserTest2 {

	public static void main(String[] args) throws Exception {
		
		//1、获取xmlReader对象
		XMLReader reader = XMLReaderFactory.createXMLReader();
		//2、设置属性
		reader.setContentHandler(new XMLDefaultHander());
		reader.setErrorHandler(new XMLDefaultHander());
		//3、解析xml
		String path  = "src/com/xml/parser/sax/web2.xml";
		reader.parse(path);
		
	}
}

class XMLDefaultHander extends DefaultHandler{

	@Override
	public void startDocument() throws SAXException {
	
	}

	@Override
	public void endDocument() throws SAXException {
	
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	
		System.out.println("uri: "+uri+"\t"+"localName: "+localName+"\t"+"qName: "+qName);
		for(int i=0;i<attributes.getLength();i++){
			String name=attributes.getQName(i);
			String value=attributes.getValue(i);
			System.out.print(name+"="+value);
		}
	}

	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

//		System.out.println("uri: "+uri+"\t"+"localName: "+localName+"\t"+"qName: "+qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("\t"+new String(ch, start, length));
		System.out.println();
	}
}


