package com.dj.ch12.lx;

public class RabbitAndTurtle extends Thread {
	private int num ;
	private static boolean end = false;
	
    public RabbitAndTurtle(String name) {
    	super(name);
    }
	
	public void run() {
		while(num<100){
			if(end)
				break;
			if(Thread.currentThread().getName().equals("Rabbit")){
				if(Math.random()<=0.5){
					for(num=0;num<100;num+=2){
						System.out.println("Rabbit"+num);
					}
				}
				Thread.yield();
			}else if(Thread.currentThread().getName().equals("Turtle")){
				if(Math.random()>0.5){
					for(num=0;num<100;num+=2){
						System.out.println("Turtle"+num);
					}
				}
				Thread.yield();
			}
			if(!end){
				System.out.println(Thread.currentThread().getName()+"Ӯ......");
				end = true;
			}
				break;
		}
	}
	
	public static void main(String[] args) {
		Thread rabbit = new RabbitAndTurtle("Rabbit");
		Thread turtle = new RabbitAndTurtle("Turtle");
		rabbit.start();
		turtle.start();
	}
	
}
