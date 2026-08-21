package lab10;

public class RacingCar extends Car {

	private String driver;
	private int turboFactor;
	
	public RacingCar() {
		super.accelerate(0);
		super.getModel();
		this.driver = "Default Driver";
		this.turboFactor = 1;
	}
	
	public RacingCar(String driver, int turboFactor) {
		super.accelerate(0);
		super.getModel();
		this.driver = driver;
		this.turboFactor = turboFactor;
	}

	protected String getDriver() {
		return driver;
	}

	protected void setDriver(String driver) {
		this.driver = driver;
	}

	protected double getTurboFactor() {
		return turboFactor;
	}

	protected void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	@Override
	void accelerate(int turboFactor) {
		super.accelerate(turboFactor);
		super.setSpeed(super.getSpeed() * turboFactor);
	}

}
