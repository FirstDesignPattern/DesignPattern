package CH04_Abstract_Factory_Bike.Samchuly;

import CH04_Abstract_Factory_Bike.abst.*;

public class SamStore extends BikeStore{

	@Override
	protected Bike createBike() {
		BikeIngredientFactory factory = new SamBikeIngredientFactory();
		Bike bike = new SamBike(factory);
		bike.setName("삼천리 자전거");
		return bike;
	}
}
