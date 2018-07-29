package com.dj.ch14;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient2 {
	
	public static void main(String[] args) {
		
		String ip = "127.0.0.1";
		int port = 9999;
		Socket socket = null;
		InputStream in = null;
		try {
			socket = new Socket(ip, port);
			System.out.println("客户端已经成功的连接到了服务器");
		     in = socket.getInputStream();
		     byte[] buf = new byte[1024];
		     int len=  in.read(buf);
			 System.out.write(buf, 0, len);
			 System.out.flush();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in!=null)in.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
