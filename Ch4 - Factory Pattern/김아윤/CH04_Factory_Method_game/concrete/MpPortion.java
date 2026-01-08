package CH04_Factory_Method_game.concrete;

import CH04_Factory_Method_game.framework.Portion;

public class MpPortion implements Portion{

	@Override
	public void use() {
		System.out.println("마력 회복!");
	}

}
