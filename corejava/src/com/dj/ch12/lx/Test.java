package com.dj.ch12.lx;

public class Test {
	public static void main(String[] args) {
		Storage data = new Storage();
		Thread counter = new Counter(data);
		Thread printer = new Printer(data);
		
		counter.start();
		printer.start();
	}
}
