package lab8;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(123, 100, "Adrian");
		System.out.println(acc.getDetails());
		
		acc.withdraw(50);
		System.out.println(acc.getDetails());
		
		acc.withdraw(60);
		System.out.println(acc.getDetails());
		
//		System.out.println(acc.close());
//		System.out.println(acc.getDetails());
	}

}
