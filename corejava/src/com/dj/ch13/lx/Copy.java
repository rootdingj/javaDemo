package com.dj.ch13.lx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
//		FileOutputStream out3 = null;
		try {
			String path1 = "src/com/dj/ch13/lx/a.txt";
			String path2 = "src/com/dj/ch13/lx/b.txt";
			String path3 = "src/com/dj/ch13/lx/c.txt";
			File file1 = new File(path1);
			File file2 = new File(path2);
			File file3 = new File(path3);
			in = new FileInputStream(file1);
			out = new FileOutputStream(file2);
			out = new FileOutputStream(file3);
			int len = -1;
//			int a = 0;
			while((len=in.read())!=-1){
//				a++;
				out.write(len);
//				out3.write(len);
				out.flush();
//				out3.flush();
			}
		} catch (Exception e) {
		}finally{
			try {
				if (in != null)in.close();
				if(out!=null)out.close();
			} catch (Exception e2) {
			}
		}
	}
}
