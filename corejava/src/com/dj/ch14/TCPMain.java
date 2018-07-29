package com.dj.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * cmd telnet 127.0.0.1 9999
 * */
public class TCPMain {
	public static List<Thread> list;
	public static void main(String[] args) {
		int port = 9999;
		ServerSocket server = null;
		Socket socket = null;
		boolean flag = true;
		list = new ArrayList<Thread>();
		try {
			server = new ServerSocket(port);
			while(flag){
				socket = server.accept();
				Thread t = new MyThread2(socket);
				list.add(t);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(server!=null)server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * 客户端线程
 * */
class MyThread2 extends Thread{
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	public MyThread2(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream(),"GBK"));
			
			pw = new PrintWriter(
					new OutputStreamWriter(
							socket.getOutputStream(),"GBK"));
			send("你好,请输入你的名字");
			String name = br.readLine();
			sendAll(name+"加入了我们");
			while(true){
				String msg = br.readLine();
				if("bye".equals(msg)){
					sendAll(name+"悄悄的离开了我们");
					break;
				}
				sendAll(name+": "+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(pw!=null)pw.close();
				if(socket!=null)socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void send(String msg){
		pw.println(msg);
		pw.flush();
	}
	public void sendAll(String msg){
		for(Thread t:TCPMain.list){
			((MyThread2)t).send(msg);
		}
	}
}