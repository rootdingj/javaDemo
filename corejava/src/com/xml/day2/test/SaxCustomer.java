package com.xml.day2.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class SaxCustomer {

	public static void main(String[] args) throws Exception {
		String path = "src/com/xml/day2/test/customer.xml";
		readXML(path);
	}

	private static void readXML(String path) throws Exception {
		XMLReader reader = XMLReaderFactory.createXMLReader();
		Hander hander = new Hander();
		reader.setContentHandler(hander);
		reader.setErrorHandler(hander);
		reader.parse(path);
	}
}
class Hander extends DefaultHandler{

	private Map<String, Double> map;
	private String name;
	
	@Override
	public void startDocument() throws SAXException {
		map = new HashMap<String, Double>();
		System.out.println("解析开始...........");
	}

	@Override
	public void endDocument() throws SAXException {
		for(Entry<String, Double>  entry1:map.entrySet()){
			System.out.println(entry1.getKey()+"花了"+entry1.getValue()+"money");
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		for(int i=0;i<attributes.getLength();i++){
			name = attributes.getValue(i);
			System.out.println("name="+name);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("uri="+uri+"\t localName="+localName+"\t qName="+qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(name!=null){
			String str = new String(ch, start, length);
			double price = Double.parseDouble(str);
			System.out.println("name="+name+"\t price=="+price);
			for(String key:map.keySet()){
				if(name.equals(key)){
					price += map.get(key);
				}
			}
			map.put(name, price);
			name = null;
		}
	}
}


