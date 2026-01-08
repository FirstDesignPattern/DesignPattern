package CH04_Abstract_Factory_Bike.abst;

public abstract class BikeStore {

	public Bike orderBike() {
		Bike bike;
		
		bike = createBike();
		
		bike.prepare();
		bike.ride();
		bike.stop();
		
		return bike;
	}

	protected abstract Bike createBike();
}
