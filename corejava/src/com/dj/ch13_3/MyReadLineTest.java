package com.dj.ch13_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyReadLineTest {
	public static void main(String[] args) {
		InputStream in = null;
		MyReadLine mrl = null;
		try {
			String filePath = "src/com/dj/ch13_3/Hello";
			in = new FileInputStream(filePath);
			//DataInputStream  BufferedInputStream
			mrl = new MyReadLine(in);
			String str = null;
			while((str=mrl.readLine())!=null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
