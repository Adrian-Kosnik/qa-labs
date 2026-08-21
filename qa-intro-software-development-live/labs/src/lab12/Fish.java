package lab12;

public class Fish extends Animal {
	
	AnimalType animalType;
	String name;

	public Fish(AnimalType animalType, String name) {
		super(name);
		this.animalType = animalType;
		this.name = name;
	}
	
	public void swim() {
		System.out.println("Fish is on the move!");
	}
	
	String getName() {
		return this.name;
	}

}
