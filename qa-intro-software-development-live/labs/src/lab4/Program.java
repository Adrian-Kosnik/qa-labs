package lab4;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n---Part-1---------------\n");

		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };

		lab4.part1.sumOfNums(numbers);

		lab4.part1.average(numbers);

		lab4.part1.minNum(numbers);

		lab4.part1.maxNum(numbers);

		lab4.part1.indexOfZero(numbers);
		
		System.out.println("\n---Part-2--Grade--------\n");
		
		String[] names = { "Adrian", "Sophie", "Jeb", "Ron", "Vicky" };
		int[] marks = { 49, 53, 65, 76, 110 };

		lab4.part2grade.getGrade(marks, names);
		
		System.out.println("\n---Part-2--Money--------\n");
		
		lab4.part2money.account("100", "5");
		
		System.out.println("\n---Part-3--Nested-Loop--\n");
		
		lab4.Part3.multiplicationTable();

	}

	

}
