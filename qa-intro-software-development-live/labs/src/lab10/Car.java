package lab10;

public class Car {
	
	private String model;
	private double speed;
	
	public Car() {
		this.model = "Default Car";
		this.speed = 0;
	}

	public Car(String model) {
		this.model = model;
		this.speed = 0;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected double getSpeed() {
		return speed;
	}

	protected void setSpeed(double speed) {
		this.speed = speed;
	}
	
	void accelerate(int seconds) {
		this.setSpeed(5 * seconds);
	}
	
	void getToSixty() {
		this.setSpeed(60);
	}
	
	

}
