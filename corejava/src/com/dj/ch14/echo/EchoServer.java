package com.dj.ch14.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static final int ECHO_SERVER_PORT = 6789;

	public static void main(String[] args) {
		ServerMain();
	}
	public static void ServerMain(){
		try {
			ServerSocket socket = new ServerSocket(ECHO_SERVER_PORT);
			System.out.println("服务器已经启动...");
			while(true){
				Socket accept = socket.accept();
				new Thread(new ClientHandler(accept)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class ClientHandler implements Runnable {
		private Socket client;
		BufferedReader br = null;
		PrintWriter pw = null;
		public ClientHandler(Socket client) {
			this.client = client;
		}
		@Override 
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
				String msg = br.readLine();
				System.out.println("收到"+client.getInetAddress()+"发送的："+msg);
				pw.println(msg);
				pw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if(br!=null)br.close();
					if(pw!=null)pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	}
}
