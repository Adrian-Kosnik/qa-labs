package lab2.airport;

public class Program {

	public static void main(String[] args) {
		
		double amountGbp = 100; // amount in GBP
		double amount = 0; // amount after conversion
		int currency = 1; // (1 = USD, 2 = EUR, 3 = JPY)
		String type = "S"; // (R = Regular, V = VIP, S = Staff)
		
		double usd = 1.25;
		double eur = 1.15;
		double jpy = 180.50;
		
		double stdServiceFee = 1.05;
		double lowServiceFee = 1.025;
		
		double regular = 1.1;
		double vip = 1.05;
		
		double amountAfterService = 0;
		double amountAfterTax = 0;
		int finalAmount = 0;
		
		switch (currency) {
		case 1:
			// USD
			
			amount = amountGbp * usd;
			
			amountAfterService = (amount >= 100) ? amount * lowServiceFee : amount * stdServiceFee;
			amountAfterTax = ((type.equals("S")) ? amount : (type.equals("V")) ? amount * vip : amount * regular);
			finalAmount = (int) ((type.equals("S")) ? (amount + (amountAfterService - amount)) : (amount + (amountAfterService - amount) + (amountAfterTax - amount)));
			
			System.out.println("amount after service: " + amountAfterService + " USD");
			System.out.println("amount after tax: " + amountAfterTax + " USD");
			System.out.println("final total: " + finalAmount + " USD");
			
			break;
		
		case 2:
			// EUR
			
			amount = amountGbp * eur;
			
			amountAfterService = (amount >= 100) ? amount * lowServiceFee : amount * stdServiceFee;
			amountAfterTax = ((type.equals("S")) ? amount : (type.equals("V")) ? amount * vip : amount * regular);
			finalAmount = (int) ((type.equals("S")) ? (amount + (amountAfterService - amount)) : (amount + (amountAfterService - amount) + (amountAfterTax - amount)));
			
			System.out.println("amount after service: " + amountAfterService + " EUR");
			System.out.println("amount after tax: " + amountAfterTax + " EUR");
			System.out.println("final total: " + finalAmount + " EUR");
			
			break;
			
		case 3:
			// JPY
			
			amount = amountGbp * jpy;
			
			amountAfterService = (amount >= 100) ? amount * lowServiceFee : amount * stdServiceFee;
			amountAfterTax = ((type.equals("S")) ? amount : (type.equals("V")) ? amount * vip : amount * regular);
			finalAmount = (int) ((type.equals("S")) ? (amount + (amountAfterService - amount)) : (amount + (amountAfterService - amount) + (amountAfterTax - amount)));
			
			System.out.println("amount after service: " + amountAfterService + " JPY");
			System.out.println("amount after tax: " + amountAfterTax + " JPY");
			System.out.println("final total: " + finalAmount + " JPY");
			
			break;

		default:
			
			System.out.println("Invalid currency");
			
			break;

		}
		
		


	}

}
