package lab13;

public class Duck extends Bird implements Flyable, Swimmable {

	public Duck(AnimalType animalType, String name) {
		super(animalType, name);
	}

	@Override
	public void move() {
		System.out.println("Moving like a Duck!");
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a Duck!");
	}

	@Override
	public void fly() {
		System.out.println("Flying like a Duck!");
	}

}
