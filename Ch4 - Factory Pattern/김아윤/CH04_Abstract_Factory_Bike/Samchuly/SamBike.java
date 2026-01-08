package CH04_Abstract_Factory_Bike.Samchuly;

import CH04_Abstract_Factory_Bike.abst.*;

public class SamBike extends Bike{
	BikeIngredientFactory factory;
	
	public SamBike(BikeIngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	protected void prepare() {
		System.out.println("삼천리 자전거 생성 중");
		body = factory.createBody();
		wheel = factory.createWheel();
		System.out.println("바디 : "+body);
		System.out.println("바퀴 : "+wheel);
		
	}
}
