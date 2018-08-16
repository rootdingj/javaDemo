package com.concurrency.ch02;

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
     private void concurrency() throws InterruptedException {
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
            	 changeStatus();
             }
         });
         t1.start();
         running();
     }

	public static void main(String[] args) throws InterruptedException {
		VolatileTest test = new VolatileTest();
		test.concurrency();
		
		
	}

}
