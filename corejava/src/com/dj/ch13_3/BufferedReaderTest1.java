package com.dj.ch13_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
   BufferedReader:</br>
                      过滤器，为其他Reader提供读缓冲区，此外它的readLine()方法能够读入一行字符串； 
 * */
public class BufferedReaderTest1 {
	
	public static void main(String[] args) {
		BufferedReader in = null;
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/dj/ch13_3/c.txt");
			in = new BufferedReader(fr);
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
		}
	}
}
