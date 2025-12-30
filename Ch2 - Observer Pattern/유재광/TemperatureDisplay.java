package ch02;

public class TemperatureDisplay implements TemperatureObserver {
    private final TemperatureSensor sensor;

    public TemperatureDisplay(TemperatureSensor sensor) {
        this.sensor = sensor;
        sensor.addObserver(this);
    }

    @Override
    public void update() {
        int temp = sensor.getTemperatureC();
        String status;
        if (temp < 0) {
            status = "추움";
        } else if (temp >= 35) {
            status = "더움";
        } else {
            status = "쾌적";
        }

        System.out.println("[표시] 현재 온도: " + temp + "°C (" + status + ")");
    }
}
