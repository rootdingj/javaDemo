package com.dj.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class MyClient {

	public static void main(String[] args) {
		
		try {
			MyService service = (MyServiceImpl)Naming.lookup("rmi://127.0.0.1/serviceHello");
			String str = service.sayHello();
			System.out.println(str);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}

}
