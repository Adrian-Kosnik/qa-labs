package lab10;

public class Program {

	public static void main(String[] args) {
		Car[] cars = new Car[4];
		cars[0] = new Car("Fiesta");
		cars[1] = new Car("Corsa");
		cars[2] = new RacingCar("Adrian", 2);
		cars[3] = new RacingCar("Sophie", 3);
		
		processCars(cars);
	}
	
	public static void processCars(Car[] cars) {
		for(Car c : cars) {
			c.getToSixty();
			c.accelerate(2);
			System.out.println(c.getModel() + c.getSpeed());
			if(c instanceof RacingCar) {
				System.out.println(((RacingCar) c).getDriver());
				System.out.println(((RacingCar) c).getTurboFactor());
			}
			System.out.println("\n");
		}
	}

}
