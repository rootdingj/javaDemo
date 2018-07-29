package com.dj.ch13_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	
	public static void main(String[] args) {
		RandomAccessFile in = null;
		RandomAccessFile out = null;
		File file = new File("src/com/dj/ch13_3/a.txt");
		try {
			in = new RandomAccessFile(file, "r");
			out = new RandomAccessFile("src/com/dj/ch13_3/c.txt", "rw");
			in.seek(1231); //设置文件偏移量
			byte[] buf = new byte[1024];
			int len = -1;
			while((len=in.read(buf))!=-1){
				out.write(buf, 0, len);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
