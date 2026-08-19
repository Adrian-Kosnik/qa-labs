package lab6;

public class Program {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Vehicle(10, 1);
		vehicles[1] = new Vehicle(10, 1);
		vehicles[2] = new Vehicle(10, 1);
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getDetails());
		}

	}

}
