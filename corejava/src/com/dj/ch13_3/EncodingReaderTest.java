package com.dj.ch13_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class EncodingReaderTest {
	public static void main(String[] args) {
		//方式一：默认编码，这种方式简便,但是要使用默认的编码去进行读写字符
		/*BufferedReader in = null;
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/dj/ch13_3/c.txt");
			in = new BufferedReader(fr);
			String str = in.readLine();
			System.out.println("str="+str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
				if(in!=null)in.close();
			} catch (IOException e) {
			}
		}*/
		
		//设置字符编码
		BufferedReader in = null;
		InputStreamReader isr = null;
		InputStream is = null;
		try {
			//创建一个字节流对象
			is = new FileInputStream("src/com/dj/ch13_3/c.txt");
			//把这个字节流包装成一个字符流 同时设置一下读写字符所使用的字符编码
			isr = new InputStreamReader(is,"UTF-8");
//			isr = new InputStreamReader(is,"GBK");
			//把这个字符流包装成一个BufferedReader对象
			in = new BufferedReader(isr);
			String str = in.readLine();
			System.out.println("str="+str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
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
