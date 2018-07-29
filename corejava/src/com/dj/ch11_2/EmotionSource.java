package com.dj.ch11_2;

//事件源 (相当于例子中的女孩)
public class EmotionSource {
	private String name;
	private EmotionListenner boy;
	
	//可以有多个监听器对事件源进行监听
	//这时候需要把每一个监听器都放到集合里面
	//private List<EmotionListenner> boys;
	
	
	//在当前事件源上面注册监听器
	public void addActionListenner(EmotionListenner listenner){
		this.boy = listenner;
	}
	
	//移除当前事件源上面的监听器
	public void removeActionListenner(){
		this.boy = null;
	}
	
	public EmotionSource() {
		this("girl");
	}
	public EmotionSource(String name) {
		this.name = name;
	}
	public void happy(){
		System.out.println("I am so Happy and I will tall the boy");
		
		//在事件源内部产生事件对象  e
		EmotionEvent e = new EmotionEvent(this);
		//然后把产生的事件(事件对象e)通知给监听器
		boy.happy(e);
	}
	
	public void sad(){
		System.out.println("I am so sad and I will tall the boy");
		
		//在事件源内部产生事件对象  e
		EmotionEvent e = new EmotionEvent(this);
		//然后把产生的事件(事件对象e)通知给监听器
		boy.sad(e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
