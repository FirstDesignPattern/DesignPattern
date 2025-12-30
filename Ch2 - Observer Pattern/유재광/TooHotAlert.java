package ch02;

public class TooHotAlert implements TemperatureObserver {
    private final TemperatureSensor sensor;

    public TooHotAlert(TemperatureSensor sensor) {
        this.sensor = sensor;
        sensor.addObserver(this);
    }

    @Override
    public void update() {
        if (sensor.getTemperatureC() >= 35) {
            System.out.println("[경고] 너무 더움: " + sensor.getTemperatureC() + "°C");
        }
    }
}
