package com.xml.parser.test;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jHome {

	public static void main(String[] args) throws Exception {
		
		String path1 = "src/com/xml/parser/test/test3.xml";
		@SuppressWarnings("unused")
		String path2 = "src/com/xml/parser/test/test1.xml";
		createXML(path1);
//		readXML(path2);
		
	}
	
	private static void createXML(String path1) throws Exception {
		Element root = DocumentHelper.createElement("briup").addAttribute("position", "浦东软件园");
		Document document = DocumentHelper.createDocument(root);
		root.addElement("ceo").addAttribute("gender", "male").addAttribute("hobby", "basketball").addText("larry");
		root.addElement("cfo").addAttribute("gender", "female").addText("xue");
		root.addElement("cto").addAttribute("gender", "male").addText("kiven");
		
		OutputFormat format = new OutputFormat("        ", true);
		format.setEncoding("utf-8");
		XMLWriter xmlwriter = new XMLWriter(new FileOutputStream(path1), format);
		xmlwriter.write(document);
		xmlwriter.close();
	}

	@SuppressWarnings("unused")
	private static void readXML(String path2) throws Exception {
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(path2);
		Element root = document.getRootElement();
		System.out.println("根节点为:"+root.getName());
		
		@SuppressWarnings("unchecked")
		List<Element> childern = root.elements();
		for(Element child:childern){
			System.out.println("次级节点为:"+child.getName());
			
			@SuppressWarnings("unchecked")
			List<Element> thrChilds = child.elements();
			for(Element thrchild:thrChilds){
				System.out.println("三级节点为:"+thrchild.getName());
				@SuppressWarnings("unchecked")
				List<Attribute> attributes = thrchild.attributes();
				for(Attribute att:attributes){
					System.out.println("属性名为:"+att.getName());
					System.out.println("属性值为:"+att.getValue());
				}
				
				@SuppressWarnings("unchecked")
				List<Element> fourchilds = thrchild.elements();
				for(Element fourchild:fourchilds){
					System.out.println("四级节点为:"+fourchild.getName());
					@SuppressWarnings("unchecked")
					List<Attribute> attributes2 = fourchild.attributes();
					System.out.println("文本内容为:"+fourchild.getText());
					for(Attribute att:attributes2){
						System.out.println("属性名为:"+att.getName());
						System.out.println("属性值为:"+att.getValue());
					}
				}
				System.out.println(".................");
			}
			System.out.println("------------------");
		}
	}
}
