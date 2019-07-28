package com.dj.pattern.observer;

// 统计布告板
public class StatisticsDisplay implements Observer {

	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("Statistics Display \n temperature: " + temp + "，humidity:" + humidity + "，pressure:"
				+ pressure);
	}

}
