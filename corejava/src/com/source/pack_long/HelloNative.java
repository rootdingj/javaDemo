package com.source.pack_long;

public class HelloNative {
	
	public native void hello();
	
	static{
        System.loadLibrary("hello");
    }

	public static void main(String[] args) {
		new HelloNative().hello();
	}

}
