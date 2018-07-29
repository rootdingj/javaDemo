package com.dj.ch13_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AvailableTest {
	public static void main(String[] args) {
		InputStream in = null;
		try {
			String filePath = "src/com/dj/ch13_2/Hello";
			File file = new File(filePath);
			in = new FileInputStream(file);
			int len = in.available();   //返回可以从输入流读取的字节数
			System.out.println(len);
			System.out.println(file.length());
			System.out.println("-------------------------");
			int data = -1;
			while((data=in.read())!=-1){
				System.out.println(in.available());
				System.out.println(data);
				System.out.println(".............");
				Thread.sleep(1000);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
  }
}