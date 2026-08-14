package lab4;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class part2money {
	
	public static void account( String investment, String rate ) {
		
		int year = 0;
		
		BigDecimal bigInvestment = new BigDecimal(investment).setScale(2, RoundingMode.HALF_UP);
		BigDecimal target = bigInvestment.multiply(BigDecimal.valueOf(2));
		BigDecimal currentBalance = bigInvestment;
		
		System.out.println("year: " + year);
		System.out.println("currentBalance: " + currentBalance);
		
		
		while (currentBalance.compareTo(target) < 0) {
			
			year++;
			currentBalance = updateBalance(currentBalance, rate);
			
			System.out.println("year: " + year);
			System.out.println("currentBalance: " + currentBalance);
			
		}
		
		
	}
	
	public static BigDecimal updateBalance( BigDecimal currentBalance, String rate) {
		
		BigDecimal ONE_HUNDRED = new BigDecimal("100");
		BigDecimal ratePercent = new BigDecimal(rate).divide(ONE_HUNDRED);
		
		BigDecimal interest = currentBalance.multiply(ratePercent);
		BigDecimal newBalance = currentBalance.add(interest).setScale(2, RoundingMode.HALF_UP);
		
		return newBalance;
		
	}

}
