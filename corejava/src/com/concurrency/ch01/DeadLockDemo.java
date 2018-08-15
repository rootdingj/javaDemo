package com.concurrency.ch01;

import org.junit.Test;

public class DeadLockDemo {

	 /** A锁 */
    private static String A = "A";
    /** B锁 */
    private static String B = "B";

    /**
    * @Description:死锁 
    * t1和t2互相等待对方释放锁
    */ 
    @Test
    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                	System.out.println("synchronized A");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("1");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                	System.out.println("synchronized b");
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
    
    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }

}
