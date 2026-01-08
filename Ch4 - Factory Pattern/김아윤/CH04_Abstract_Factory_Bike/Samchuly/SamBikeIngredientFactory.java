package CH04_Abstract_Factory_Bike.Samchuly;

import CH04_Abstract_Factory_Bike.abst.*;

public class SamBikeIngredientFactory implements BikeIngredientFactory{

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}

}
