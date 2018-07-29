package com.dj.ch14_2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

//服务端，接收、发送
public class TimeUdpServer{
	public static void main(String[] args){
		//当前套接字使用的端口
		int port = 9999;
		//UDP套接字(Socket)
		DatagramSocket ds = null;
		//数据报包
		DatagramPacket dp = null;
		//用来接收数据的数组
		byte[] buf = new byte[1024];
		//接收到数据包是那个客户端的IP地址
		InetAddress clientAddress = null;
		//接收到数据包是那个客户端所使用的端口
		int clientPort;
		String time = new Date().toString();
		try{
			//1.创建一个用来发送和接收数据报包的套接字，并指定使用的端口
			//创建一个UDP的socket 用来接收和发送数据
			ds = new DatagramSocket(port);
			//2.创建一个数据报包对象
			dp = new DatagramPacket(buf,buf.length);
			while(true){
				//3.接收数据包 (没有接受到就会线程阻塞)
				ds.receive(dp);
				//4.接收到数据包后获得所发包的主机的ip和端口
				clientAddress = dp.getAddress();
				clientPort = dp.getPort();
				System.out.println("clientAddress = "+clientAddress);
				System.out.println("clientPort = "+clientPort);
				
				//5.准备好给发送的数据
				buf = time.getBytes();
				//把数据封装到数据包中，指明接受主机的IP和端口
				dp = new DatagramPacket(buf,buf.length,clientAddress,clientPort);
				//6.发送
				ds.send(dp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(ds != null)ds.close();
			}catch(Exception e){}
		}
	}
}

