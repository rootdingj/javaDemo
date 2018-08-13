package com.xml.day2.test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxTest {

	public static void main(String[] args) throws Exception {
		
		String url = "src/com/xml/day2/test/test.xml";
		parserXML(url);
	}

	private static void parserXML(String url) throws Exception {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(url, new DefaultHandler());
	}

}
