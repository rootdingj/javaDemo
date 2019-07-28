package com.dj.pattern.observer;

public class TestWeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		Observer statisticsDisplay = new StatisticsDisplay(weatherData);
		Observer forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(0, 0, 0);
		System.out.println("-------------------------------------");
		weatherData.setMeasurements(1, 1, 1);
		
	}

}
