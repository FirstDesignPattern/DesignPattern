package com.observer.bad;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(
                new CurrentConditionDisplay(),
                new ForecastDisplay(),
                new StatisticsDisplay(),
                new HeatIndexDisplay()
        );

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 92, 29.2f);
    }
}