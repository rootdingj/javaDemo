package com.dj.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// 实际服务类
public class MyServiceImpl extends UnicastRemoteObject implements MyService {

	protected MyServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {

		System.out.println("远程服务端。。。");
		return "远程服务端";
	}

	public static void main(String[] args) {
		try {
			// 生成服务辅助对象
			MyService service = new MyServiceImpl();
			// 利用rmi注册访问名和绑定服务辅助对象
			Naming.rebind("serviceHello", service);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
