package com.dj.ch10.lx_01;

import java.util.Scanner;

public class TestException {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		try {
			System.out.println("2.........");
			int num = num1/num2;
			System.out.println("1.........");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
