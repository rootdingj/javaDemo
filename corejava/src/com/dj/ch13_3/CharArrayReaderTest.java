package com.dj.ch13_3;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
   CharArrayReader:</br>
   					把字符数组转换为Reader，从字符数组中读取字符；
 * */
public class CharArrayReaderTest {
	
	public static void main(String[] args) {
		CharArrayReader in = null;
		CharArrayWriter out = null;
//		char[] c = "hello world".toCharArray();
		char[] c = "你好".toCharArray();
		System.out.println("c.length="+c.length);
		try {
			in = new CharArrayReader(c);
			out = new CharArrayWriter();
			int data = -1;
			int num = 0;
			while((data=in.read())!=-1){
				num++;
				out.write(data);
				out.flush();
			}
			System.out.println("num="+num);
			System.out.println("out.toString()="+out.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in!=null)in.close();
			if(out!=null)out.close();
		}
	}
}
