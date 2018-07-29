package com.dj.ch10.lx_01;

public class DivisionByZero {
	public static void main(String[] args) throws Exception {
		
		DivisionByZero d = new DivisionByZero();
		d.division(10, 0);
	}
	public void division(int a,int b){
		/*try {
			a = 10;
			b = 0;
		int	c = a/b;
			System.out.println("..........");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("音嬬竃巣。。。。。");
			e.printStackTrace();
		}*/
		a = 10;
		b = 0;
		System.out.println("1...........");
		int c = a/b;
		System.out.println("2..........");
	}
}
