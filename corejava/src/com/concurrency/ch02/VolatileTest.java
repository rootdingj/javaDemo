package com.concurrency.ch02;

import org.junit.Test;

public class VolatileTest {

	boolean status = false;

	/**
     * 状态切换为true
     */
	public void changeStatus() {
		status = true;
	}
	
	/**
     * 若状态为true，则running。
     */
    public void running(){
        if(status){
            System.out.println("running....");
        }else {
        	System.out.println("changeStatus....");
        }
    }
    
    /**
     * @Description: 并发计算
     * @throws InterruptedException 
     */ 
    @Test
     private void concurrency() throws InterruptedException {
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
            	 changeStatus();
             }
         });
         t1.start();
         
         //输出 running....
         /*Thread t2 = new Thread(new Runnable() {
             @Override
             public void run() {
            	 running();
             }
         });
         t2.start();*/
         // 输出 changeStatus....
         running();
         
     }

	public static void main(String[] args) throws InterruptedException {
		VolatileTest test = new VolatileTest();
		test.concurrency();
		
	}

}
