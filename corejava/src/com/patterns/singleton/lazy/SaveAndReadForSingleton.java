package com.patterns.singleton.lazy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndReadForSingleton {

	public static void main(String[] args) {
		MySingleton06 singleton = MySingleton06.getInstance();
		File file = new File("MySingleton.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton);
			fos.close();
			oos.close();
			System.out.println(singleton.hashCode());
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			MySingleton06 rSingleton = (MySingleton06) ois.readObject();
			fis.close();
			ois.close();
			System.out.println(rSingleton.hashCode());
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
	}

}
