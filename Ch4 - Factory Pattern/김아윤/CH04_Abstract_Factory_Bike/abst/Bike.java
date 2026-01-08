package CH04_Abstract_Factory_Bike.abst;

public abstract class Bike {
	String name;
	
	protected Body body;
	protected Wheel wheel;
	
	protected abstract void prepare();
	
	void ride() {
		System.out.println(name+" 자전거 타기");
	}

	void stop() {
		System.out.println(name+" 자전거 멈추기");
	}
	
	public void setName(String name) {
        this.name = name;
    }
}
