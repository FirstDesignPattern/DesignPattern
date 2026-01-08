package CH04_Abstract_Factory_Bike;

import CH04_Abstract_Factory_Bike.abst.*;
import CH04_Abstract_Factory_Bike.Gt.*;
import CH04_Abstract_Factory_Bike.Samchuly.*;

public class BikeTestDrive {

	public static void main(String[] args) {
		BikeStore store;
		Bike bike;
		
		store = new SamStore();
		bike = store.orderBike();
		System.out.println();

		store = new GtStore();
		bike = store.orderBike();
	}
}
