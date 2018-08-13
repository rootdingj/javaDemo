package com.xml.parser.sax;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserTest {

	public static void main(String[] args) throws Exception {
		//I、需要xml的存放路径
		String path  = "src/com/xml/parser/sax/web.xml";
		parserXML(path);

	}

	private static void parserXML(String path) throws Exception {
		//II、类似于这个工具类，拿到对象的模式都是采用工厂模式
		//1、拿到工厂对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2、通过工厂生产产品  SAXParser  解析器
		SAXParser parser = factory.newSAXParser();
		
		//DefaultHandler ==>listener
		parser.parse(path, new DefaultHandler(){
		//3、解析文件
			//当遇到xml文档开头，就执行一下方法
			@Override
			public void startDocument() throws SAXException {
				System.out.println("<?xml version='1.0' encoding='utf-8'?>");
				
			}

			//当遇到xml文档结尾，就执行一下方法
			@Override
			public void endDocument() throws SAXException {
				super.endDocument();
			}

			/*当遇到xml开始标签，就执行一下方法
			 *uri:命名空间的网址
			 *localName:不带有命名空间的标签名 
			 *qName:带有命名空间的标签名 
			 *attributes:类似于map的结构 ,存放的是一个对象，所以需要通过遍历把里面的值拿出来
			 * */
			@Override
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {

				System.out.print("<"+qName+" ");
				for(int i=0;i<attributes.getLength();i++){
					//获得属性名
					String attname = attributes.getQName(i);
					///获得属性值
					String attvalue = attributes.getValue(attname);  //通过属性名和下标都能够拿到属性值
					System.out.print(attname+"="+attvalue+" ");
				}
				System.out.println(">");
			}

			@Override
			public void endElement(String uri, String localName, String qName) throws SAXException {
				System.out.print("<"+qName+">");
			}
			
			//当遇上字符执行下面方法
			@Override
			public void characters(char[] ch, int start, int length) throws SAXException {
				System.out.println(new String(ch, start, length));
				
			}
		});
	}
}
