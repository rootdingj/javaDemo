package com.dj.ch11_2;

//事件对象类  (相当于例子中女孩产生的那些事情 比如渴了、饿了、高兴、伤心等事件)(事件源的描述)
public class EmotionEvent {
	//事件对象里面要有事件源对象(谁产出这个事件对象)
	private Object source;
	private String desc;
	
	
	public EmotionEvent(Object source) {
		this.source = source;
	}
	public EmotionEvent(Object source, String desc) {
		this.source = source;
		this.desc = desc;
	}
	public Object getSource() {
		return source;
	}
	public void setSource(Object source) {
		this.source = source;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
