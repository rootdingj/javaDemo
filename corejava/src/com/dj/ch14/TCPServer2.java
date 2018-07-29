package com.dj.ch14;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer2 {

	public static void main(String[] args) {
		int port = 9999;
		ServerSocket server = null;
		Socket socket = null;
		OutputStream out = null;
		try {
			server = new ServerSocket(port);
			System.out.println("服务器端等待客户端的连接...");
			socket = server.accept();
		    out = socket.getOutputStream();  
			byte[] buf = "hello".getBytes();
			out.write(buf, 0, buf.length);
			out.flush();
			System.out.println("服务器端连接到了客户端...");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(out!=null)out.close();
				if(server!=null)server.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
