package com.dj.ch13_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {
	
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader in = null;
		try {
			//创建一个字节流对象
			is = new FileInputStream("src/com/dj/ch13_3/a.txt");
			//把这个字节流包装成一个字符流
			isr = new InputStreamReader(is);
			//把一个字符流isr包装成一个BufferedReader对象
			in = new BufferedReader(isr);
			long l1 = System.currentTimeMillis();
			String str = null;
			while((str=in.readLine())!=null){
				System.out.println(str);
			}
			long l2 = System.currentTimeMillis();
			System.out.println(l2-l1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is!=null)is.close();
				if(isr!=null)isr.close();
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
