package com.chensong.headfirst.观察者模式;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(12, 23, 44);
	}
}
