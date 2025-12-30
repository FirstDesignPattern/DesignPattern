package ch02;

public class TooColdAlert implements TemperatureObserver {
    private final TemperatureSensor sensor;

    public TooColdAlert(TemperatureSensor sensor) {
        this.sensor = sensor;
        sensor.addObserver(this);
    }

    @Override
    public void update() {
        if (sensor.getTemperatureC() < 0) {
            System.out.println("[경고] 너무 추움: " + sensor.getTemperatureC() + "°C");
        }
    }
}
