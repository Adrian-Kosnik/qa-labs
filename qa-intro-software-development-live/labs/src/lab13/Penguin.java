package lab13;

public class Penguin extends Bird implements Swimmable {

	public Penguin(AnimalType animalType, String name) {
		super(animalType, name);
	}

	@Override
	public void move() {
		System.out.println("Moving like a Penguin!");
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a Penguin!");
	}

}
