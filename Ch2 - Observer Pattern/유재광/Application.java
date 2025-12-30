package ch02;


public class Application {

	public static void main(String[] args) {
		TemperatureSensor sensor = new TemperatureSensor();

		new TemperatureDisplay(sensor);
		new TooColdAlert(sensor);
		new TooHotAlert(sensor);

		sensor.setTemperatureC(-5);
		sensor.setTemperatureC(20);
		sensor.setTemperatureC(36);
	}
}
