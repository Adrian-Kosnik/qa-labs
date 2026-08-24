package lab13;

public class Program {

	public static void main(String[] args) {
		
		Fish fish = new Fish(AnimalType.Fish, "Big Tuna");
		Duck duck = new Duck(AnimalType.Bird, "Jeb");
		Penguin penguin = new Penguin(AnimalType.Bird, "Steve");
		
		Animal[] animals = new Animal[3];
		animals[0] = fish;
		animals[1] = duck;
		animals[2] = penguin;
		
		for(Animal a : animals) {
			if(a instanceof Flyable) {
				((Flyable) a).fly();
			} else if(a instanceof Swimmable) {
				((Swimmable) a).swim();
			}
		}

	}

}
