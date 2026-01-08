package CH04_Abstract_Factory_Bike.Gt;

import CH04_Abstract_Factory_Bike.abst.*;

public class GtBikeIngredientFactory implements BikeIngredientFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
