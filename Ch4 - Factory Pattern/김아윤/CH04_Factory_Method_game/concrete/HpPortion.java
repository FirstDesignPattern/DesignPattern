package CH04_Factory_Method_game.concrete;

import CH04_Factory_Method_game.framework.Portion;

public class HpPortion implements Portion{

	@Override
	public void use() {
		System.out.println("체력 회복!");
	}
}
