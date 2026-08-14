package lab3;

public class Program {

	public static void main(String[] args) {
		
		theLunchQueue();
		
//		convertInputToStonesPounds(50);
		
//		convertKgsToStonesPounds(50);

	}
	
	
	
	public static void theLunchQueue() {
		Utils utils = new Utils();
		
		String mainCourse = utils.getString("What main dish would you like(Fish, Burgers or veg) ?");
		int numPotato = utils.getInt("How many roast potatoes would you like?");
		int numSprouts = utils.getInt("How many Brussel Sprouts would you like?");
		
		System.out.printf("Hello, your lunch is %s with %s roast potatoes and %s Brussel sprouts.", mainCourse, numPotato, numSprouts);
	}
	
	static void convertInputToStonesPounds(int pounds) {
		
		int stones = pounds / 14;
		int nPounds = pounds % 14;
		
		System.out.printf("%s stone and %s pounds\n", stones, nPounds);
		
	}
	
	static void convertKgsToStonesPounds(int kg) {
		
		double pounds = kg * 2.20462;
		
		convertInputToStonesPounds((int) pounds);
	}

}











