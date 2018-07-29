package com.dj.ch13_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	
	public static void main(String[] args) {
		
		BufferedWriter out = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/com/dj/ch13_3/b.txt");
			out = new BufferedWriter(fw);
			/*out.write("test1");
			out.write("test2");
			out.write("test3");
			out.write("test4");
			out.flush();*/
			
			/*out.write("test1");
			out.newLine();
			out.write("test2");
			out.newLine();
			out.write("test3");
			out.newLine();
			out.write("test4");
			out.newLine();
			out.flush();*/
			
			/*out.write("test1\n");
			out.write("test2\n");
			out.write("test3\n");
			out.write("test4\n");
			out.flush();*/
			
			println(out,"test1");
			println(out,"test2");
			println(out,"test3");
			println(out,"test4");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(out!=null)out.close();
				if(fw!=null)fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void println(BufferedWriter out,String str) throws IOException{
		out.write(str+"\n");
	}
}
