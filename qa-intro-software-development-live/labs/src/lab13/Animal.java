package lab13;

public abstract class Animal implements Movable {
	
	AnimalType animalType;
	String name;
	
	public Animal(AnimalType animalType, String name) {
		this.animalType = animalType;
		this.name = name;
	}
	
	public void getName() {
		
	}
	
}
