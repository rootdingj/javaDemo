package com.dj.ch13_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
   FileReader:</br>
   	        从文件中读取字符 
 * */
public class FileReaderTest {

	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		try {
			File file = new File("src/com/dj/ch13_3/a.txt");
			in = new FileReader(file);
			out = new FileWriter("src/com/dj/ch13_3/c.txt");
			long l1 = System.currentTimeMillis();
			char[] c=  new char[512];
			int len = -1;
			while((len=in.read(c))!=-1){
				out.write(c,0,len);
				out.flush();
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
