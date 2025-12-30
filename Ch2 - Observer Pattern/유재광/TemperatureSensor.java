package ch02;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private int temperatureC;

    public void addObserver(TemperatureObserver observer) {
        if (observer == null) {
            return;
        }
        observers.add(observer);
    }

    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void setTemperatureC(int temperatureC) {
        this.temperatureC = temperatureC;
        notifyObservers();
    }

    public int getTemperatureC() {
        return temperatureC;
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update();
        }
    }
}
