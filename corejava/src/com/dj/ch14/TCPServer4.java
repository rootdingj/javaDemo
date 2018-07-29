package com.dj.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer4 {

	public static void main(String[] args) {
		int port = 9999;
		ServerSocket server = null;
		Socket socket = null;
		OutputStream out = null;
		InputStream in = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			server = new ServerSocket(port);
			
			System.out.println("服务器端等待客户端的连接...");
			socket = server.accept();
			System.out.println("服务器端连接到了客户端");
			
			in = socket.getInputStream();
			out = socket.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			pw = new PrintWriter(new OutputStreamWriter(out));
			
			pw.println("你好，请问你是谁");
			pw.flush();
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(pw!=null)pw.close();
				if(br!=null)br.close();
				if(server!=null)server.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
