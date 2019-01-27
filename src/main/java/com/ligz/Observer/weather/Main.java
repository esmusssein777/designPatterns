package com.ligz.Observer.weather;

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(1, 2, 3);
	}
}
