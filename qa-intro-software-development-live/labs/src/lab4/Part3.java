package lab4;

public class Part3 {
	
	public static void multiplicationTable() {
		
		System.out.println("multiplicationTable");
		
		for (int row = 0; row <= 10; row++) {
			
			System.out.println("");
			
			for (int col = 0; col <= 10; col++) {
				
				if (row == 0 && col == 0) {
					
					System.out.printf("%5s", "");
					
				} else if (row == 0) {
					
					System.out.printf("%5s", "col");
				
				} else if (col == 0) {
					
					System.out.printf("%5s", "row");
					
				} else {
					
					System.out.printf("%5d", col * row);
					
				}
				
			}
			
			
		}
		
	}
	
}
