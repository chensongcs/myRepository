package com.chensong.headfirst.�۲���ģʽ;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(12, 23, 44);
	}
}
