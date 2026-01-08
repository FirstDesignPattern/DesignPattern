package CH04_Factory_Method_game.concrete;

import java.util.*;

import CH04_Factory_Method_game.framework.Portion;
import CH04_Factory_Method_game.framework.PortionCreator;

public class HpPortionCreator extends PortionCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 체력 회복 물약의 정보를 가져옵니다.");
	}

	@Override
	protected Portion createItem() {
		return new HpPortion();
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 물약을 새로 생성했습니다. "+ new Date());
	}

}
