package com.dj.pattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 接口： 定义了供客户调用的远程方法
public interface MyService extends Remote {
	
	String sayHello() throws RemoteException;

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
