package com.dj.ch07;

 interface Product {
	int getProduceTime();
}

interface Output{
	
	int MAX_CACHE_LINE = 30;
	void out();
	void getData(String msg);
}

public class Printer implements Product,Output{

	private String[] printData = new String[MAX_CACHE_LINE];
	//用来记录当前需打印的页数
	private int dataNum = 0;
	
	@Override
	public void out() {
		//只要还有作业就继续打印
		while(dataNum>0){
			System.out.println("打印"+printData);
			//把作业队列整体前移一位，并将剩下的作业数减一
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("队列已满添加失败");
		}else{
			printData[dataNum++] = msg;
		}
	}

	@Override
	public int getProduceTime() {
		return 40;
	}
	
	public static void main(String[] args) {
		Output o = new Printer();
		o.getData("你好");
		o.getData("如何使用接口");
		o.out();
		o.getData("加油");
		o.out();
		//创建一个Printer对象当作Product用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量都可以直接赋值给Object类型的变量
		Object obj = p;
	}
}