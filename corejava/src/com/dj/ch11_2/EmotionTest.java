package com.dj.ch11_2;


public class EmotionTest {
	
	public static void main(String[] args) {
		//ÊÂ¼þÔ´
		EmotionSource girl = new EmotionSource("lily");
		
		girl.addActionListenner(new EmotionListenner() {
			
			public void sad(EmotionEvent e) {
				EmotionSource girl = (EmotionSource) e.getSource();
				String name = girl.getName();
				System.out.println("I am the listenner-boy and I am so Sad too because "+name+" is Sad");
			}
			
			public void happy(EmotionEvent e) {
				EmotionSource girl = (EmotionSource) e.getSource();
				String name = girl.getName();
				System.out.println("I am the listenner-boy and I am so Happy too because "+name+" is Happy");
				
			}
		});
		
		girl.happy();
	}
	
}
