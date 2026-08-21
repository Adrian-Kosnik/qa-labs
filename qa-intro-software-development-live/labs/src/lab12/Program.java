package lab12;

public class Program {

	public static void main(String[] args) {

		Animal[] animals = new Animal[2];
		
//		animals[0] = new Duck("Jeb");
//		animals[1] = new Fish(AnimalType.Fish, "Jerry");
		
//		for(Animal a : animals) {
//			((Duck) a).makeNest();
//		}
		
		Animal fish = new Fish(AnimalType.Fish, "Jeb");
		Animal duck = new Duck("Rodger");
		
		System.out.println(fish.getName());
		System.out.println(duck.getName());
		
	}

}
