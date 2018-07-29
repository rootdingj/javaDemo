package com.dj.ch13_3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
	
public static void main(String[] args) throws IOException {
		/*File file = new File("src/com/dj/ch13_3/c.txt");
		if(!file.exists()){
			System.out.println("´´½¨:"+file.createNewFile());
		}*/
//		System.out.println(file);
//		System.out.println(file.exists());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.canExecute());
//		System.out.println(file.getPath());
//		System.out.println(file.getParent());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getCanonicalPath());
//		System.out.println(file.length());
//		System.out.println(file.getName());
//		System.out.println(file.delete());
		
		File file2 = new File("src/com/dj/ch13_3/c.txt");
		System.out.println(file2.list());
		System.out.println(Arrays.toString(file2.list()));
		
	}
}
