package lab13;

public class Fish extends Animal implements Swimmable {

	public Fish(AnimalType animalType, String name) {
		super(animalType, name);
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a Fish!");
	}

	@Override
	public void move() {
		System.out.println("Moving like a Fish!");
	}

}