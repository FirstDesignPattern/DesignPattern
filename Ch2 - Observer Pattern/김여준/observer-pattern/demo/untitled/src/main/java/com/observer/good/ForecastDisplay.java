package com.observer.good;

public class ForecastDisplay implements Observer, DisplayElement {
    private float lastPressure = 1013f;
    private float currentPressure = 1013f;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            System.out.println("[Forecast] Improving weather (pressure up)");
        } else if (currentPressure < lastPressure) {
            System.out.println("[Forecast] Watch out for cooler, rainy weather (pressure down)");
        } else {
            System.out.println("[Forecast] More of the same");
        }
    }
}
