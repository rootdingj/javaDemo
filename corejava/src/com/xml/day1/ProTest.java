package com.xml.day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;

public class ProTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		//当程序中有经常变动或以后可能会变动的信息，就用配置文件
		
		int port = 0;
		
		Properties prop = new Properties();
		
		prop.load(new FileInputStream("src/com/xml/day1/test.properties"));
		
		port = Integer.parseInt(prop.getProperty("port"));
		
		System.out.println("端口号为："+port);
		
		@SuppressWarnings("resource")
		ServerSocket socket = new ServerSocket(port);
		
	}
}
