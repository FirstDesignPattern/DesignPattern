package CH04_Abstract_Factory_Bike.Gt;

import CH04_Abstract_Factory_Bike.abst.*;

public class GtStore extends BikeStore{

	@Override
	protected Bike createBike() {
		BikeIngredientFactory factory = new GtBikeIngredientFactory();
		Bike bike = new GtBike(factory);
		bike.setName("GT 자전거");
		return bike;
	}

}
