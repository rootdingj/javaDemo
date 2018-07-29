package com.dj.ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer3 {

	public static void main(String[] args) {
		
		int port = 9999;
		ServerSocket server = null;
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		try {
			//1.创建一个ServerSocket对象表示服务器，同时绑定一个端口
			server = new ServerSocket(port);
			
			/*
			    2.监听连接请求，如果客户端请求连接，则接受连接，返回通信套接字(socket对象)；
			               通过这个socket对象可以知道客户端程序所在的电脑IP和所在内存的端口号（知道这个连接的客户端是谁） 
			 * */
			System.out.println("服务器端等待客户端的连接...");
			socket = server.accept();
			System.out.println("服务器端连接到了客户端...");
			
			/*
			     3.getOutputStream()和getInputStream()获取输出流和输入流，开始网络数据的发送和接收 
			 * */
		    out = socket.getOutputStream();  
			byte[] buf = "hello".getBytes();
			out.write(buf, 0, buf.length);
			out.flush();
			
			in = socket.getInputStream();
			buf = new byte[1024];
			int len = in.read(buf);
			System.out.write(buf, 0, len);
			System.out.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				//4.关闭通信套接字
				if(out!=null)out.close();
				if(in!=null)in.close();
				if(server!=null)server.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
