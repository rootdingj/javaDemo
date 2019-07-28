package com.dj.pattern.observer;

import java.util.ArrayList;
import java.util.List;

// 具体主题（天气）
public class WeatherData implements Subject {

	private List<Observer> observers;
	// 温度
	private float temperature;
	// 湿度
	private float humidity;
	// 气压
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
}
