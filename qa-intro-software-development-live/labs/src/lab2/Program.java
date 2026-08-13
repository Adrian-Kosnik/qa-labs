package lab2;

public class Program {

	public static void main(String[] args) {
		
		int mark = 99;
		
		if (mark <= 100 && mark >= 71) {
			System.out.println("Distnction");
		}
		else if (mark <= 70 && mark >= 61) {
			System.out.println("Merit");
		}
		else if (mark <= 60 && mark >= 50) {
			System.out.println("Pass");
		}
		else if (mark < 50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("error");
		}
	}
}
