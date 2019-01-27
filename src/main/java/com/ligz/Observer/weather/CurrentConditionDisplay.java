package com.ligz.Observer.weather;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println(temp + humidity);
		
	}
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
}
