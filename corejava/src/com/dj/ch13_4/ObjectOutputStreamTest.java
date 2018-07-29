package com.dj.ch13_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, "tom1", 22);
		Student s2 = new Student(2, "tom2", 23);
		ObjectOutputStream out = null;
		FileOutputStream fos = null;
		try {
			File file = new File("src/com/dj/ch13_4/a.txt");
			//设置文件追加，FileOutputStream(File file, boolean append)
			fos = new FileOutputStream(file, true);
			out = new ObjectOutputStream(fos);
			//把对象s1序列化到文件中:把对象写到一个输出流；
			out.writeObject(s1);
			out.writeObject(s2);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
