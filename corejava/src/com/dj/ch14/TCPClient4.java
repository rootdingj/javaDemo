package com.dj.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient4 {
	
	public static void main(String[] args) {
		
		String ip = "127.0.0.1";
		int port = 9999;
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket(ip, port);
			System.out.println("客户端已经成功的连接到了服务器");

			in = socket.getInputStream();
			out = socket.getOutputStream();
			br = new BufferedReader(
					new InputStreamReader(in));
			pw = new PrintWriter(
					new OutputStreamWriter(out));
			
			String msg = br.readLine();
			System.out.println(msg);
			
			pw.println("我是张三");
			pw.flush();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(pw!=null)pw.close();
				if(br!=null)br.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
