package com.dj.pattern.observer;

// 主题接口
public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();

}
