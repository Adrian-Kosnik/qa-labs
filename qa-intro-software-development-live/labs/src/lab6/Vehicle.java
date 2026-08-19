package lab6;

public class Vehicle {

	int speed;
	int lane;
	int distanceTravelled;
	RegistrationPlate plate;
	
//	private final int number;

	public Vehicle(int speed, int lane) {
		
		this.speed = speed;
		this.lane = lane;
		plate = RegistrationPlateFactory.getNextRegistrationPlate();
		
	}
	
	void accelerate(int amount) {
		if(amount <= 200) {
			speed += amount;
			distanceTravelled += amount;
		}
	}
	
	void brake(int amount) {
		if(amount <= speed) {
			speed -= amount;
		}
	}
	
	String getDetails() {
		String details = "Reg Plate: " + plate + "\nSpeed: " + speed + "\nLane: " + lane + "\nDistance Travelled: " + distanceTravelled;
		return details;
	}
	
}
