package com.dj.ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient3 {
	
	public static void main(String[] args) {
		String ip = "127.0.0.1";
		int port = 9999;
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			/*
			   1.创建一个套接字，并连接到服务器端
			        连接的IP是127.0.0.1
			         如果这个socket对象能创建出来则说明客户端和服务器已经连接
			 * */
			 socket = new Socket(ip, port);
			 System.out.println("客户端已经成功的连接到了服务器...");
			
			 /*
			     getOutputStream()和getInputStream()获取输出流和输入流，开始网络数据的发送和接收 
			  * */
		     in = socket.getInputStream();
		     byte[] buf = new byte[1024];
		     int len=  in.read(buf);
			 System.out.write(buf, 0, len);
			 System.out.flush();
			 
			 out = socket.getOutputStream();
			 out.write("world".getBytes());
			 out.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				//3.关闭通信套接字
				if(in!=null)in.close();
				if(out!=null)out.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
