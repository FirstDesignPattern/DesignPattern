package com.observer.bad;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private final CurrentConditionDisplay currentConditionDisplay;
    private final ForecastDisplay forecastDisplay;
    private final StatisticsDisplay statisticsDisplay;
    private final HeatIndexDisplay heatIndexDisplay;

    public WeatherData (CurrentConditionDisplay currentConditionDisplay,
                        ForecastDisplay forecastDisplay,
                        StatisticsDisplay statisticsDisplay,
                        HeatIndexDisplay heatIndexDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
        this.forecastDisplay = forecastDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.heatIndexDisplay = heatIndexDisplay;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humid = getHumidity();
        float pres = getPressure();

        currentConditionDisplay.update(temp, humid, pres);
        statisticsDisplay.update(temp, humid, pres);
        forecastDisplay.update(temp, humid, pres);
        heatIndexDisplay.update(temp, humid);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
