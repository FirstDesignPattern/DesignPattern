package CH04_Factory_Method_game;

import CH04_Factory_Method_game.concrete.HpPortionCreator;
import CH04_Factory_Method_game.concrete.MpPortionCreator;
import CH04_Factory_Method_game.framework.Portion;
import CH04_Factory_Method_game.framework.PortionCreator;

public class GameTestDrive {

	public static void main(String[] args) {
		PortionCreator creator;
		Portion item;
		
		creator = new HpPortionCreator();
		item = creator.create();
		item.use();
		System.out.println();

		creator = new MpPortionCreator();
		item = creator.create();
		item.use();
	}

}
