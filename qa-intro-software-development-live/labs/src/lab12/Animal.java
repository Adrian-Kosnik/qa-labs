package lab12;

public abstract class Animal {

	AnimalType animalType;
	String name;
	
	public Animal(String name) {
		this.name = name;
	}

	abstract String getName();

}
