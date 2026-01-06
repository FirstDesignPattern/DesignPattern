package com.observer.good;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("[Stats] temperature=" + temperature + ", humidity=" + humidity);
    }
}
