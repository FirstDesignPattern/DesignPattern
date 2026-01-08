package CH04_Factory_Method_game.framework;

public abstract class PortionCreator {
	
	public Portion create() {
		Portion item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	// 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다 
	abstract protected void requestItemsInfo();
	
	// 아이템을 생성한다
	abstract protected Portion createItem();
	
	// 아이템을 생성한 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성 정보를 남긴다
	abstract protected void createItemLog();
	
}
