package com.dj.ch14_2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//客户端，发送、接受
public class TimeUdpClient{
	public static void main(String[] args){
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] buf = new byte[1024];
		InetAddress serverAddress = null;
		int serverPort = 9999;
		String serverIp = "127.0.0.1";
		try{
			//1.创建数据报套接字,自己自动绑定一个系统中可用的端口,我们也可以给它指定一个端口
			ds = new DatagramSocket();
			//2.要把数据发送到那个主机的IP
			serverAddress = InetAddress.getByName(serverIp);
			//把数据封装到数据包中，指明接受主机的IP和端口
			//只不过这个的存放数据的数组中没有任何数据
			dp = new DatagramPacket(buf,buf.length,serverAddress,serverPort);
			//3.发送数据包
			ds.send(dp);
			
			//4.创建一个数据包对象,用来接受数据
			dp = new DatagramPacket(buf,buf.length);
			//5.接受数据包 (线程会阻塞)
			ds.receive(dp);
			System.out.println("Time:" + new String(buf));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				//6.
				if(ds != null)
					ds.close();
			}catch(Exception e){}
		}
	}
}
