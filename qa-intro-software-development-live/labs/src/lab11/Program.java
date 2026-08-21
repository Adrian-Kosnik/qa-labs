package lab11;

public class Program {

	public static void main(String[] args) {
		
		Manager manager = new Manager("Adrian", "Manager");
		manager.addEmployee(new Employee("Sophie", "Not Manager"));
		manager.addEmployee(new Employee("Jeb", "Bird"));
		manager.addEmployee(new SkilledWorker("Jeb", "Bird"));

	}

}
