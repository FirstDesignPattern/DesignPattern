package CH04_Abstract_Factory_Bike.Gt;

import CH04_Abstract_Factory_Bike.abst.*;

public class GtBike extends Bike{
	BikeIngredientFactory factory;
	
	public GtBike(BikeIngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	protected void prepare() {
		System.out.println("GT 자전거 생성 중");
		body = factory.createBody();
		wheel = factory.createWheel();
		System.out.println("바디 : "+body);
		System.out.println("바퀴 : "+wheel);
	}

}
