package com.dj.pattern.observer;

// 预测布告板
public class ForecastDisplay implements Observer {

	public ForecastDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("Forecast Display \n temperature: " + temp + "，humidity:" + humidity + "，pressure:"
				+ pressure);
	}

}
