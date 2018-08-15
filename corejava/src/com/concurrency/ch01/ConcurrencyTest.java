package com.concurrency.ch01;

public class ConcurrencyTest {
	 /** 执行次数 */
    private static final long count = 1000000000l;

    public static void main(String[] args) throws InterruptedException {
        //并发计算
        concurrency();
        //单线程计算
        serial();
    }

    /**
    * @Description: 并发计算
    * @throws InterruptedException 
    */ 
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
                System.out.println("多线程 : a= "+a);
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("多线程 : " + time + "ms, b=" + b);
    }

    /**
     * 
     */
    /**
    * @Description: 单线程计算 
    */ 
    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("单线程: " + time + "ms, b=" + b + ",a=" + a);
    }

}
