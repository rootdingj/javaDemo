package com.dj.pattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializeSingleton {

	public static void main(String[] args) {
		SerializeSingleton singleton = SerializeSingleton.getInstance();
		File file = new File("MySingleton.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois =  null;
		try {
		    // 序列化
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton);
			System.out.println("序列化 hashCode: "+singleton.hashCode());
			
			// 反序列化
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			SerializeSingleton rSingleton = (SerializeSingleton) ois.readObject();
			System.out.println("反序列化 hashCode: "+rSingleton.hashCode());
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				if(oos!=null) {
					oos.close();
				}
				if(fis!=null) {
					fis.close();
				}
				if(ois!=null) {
					ois.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
