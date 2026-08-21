package lab11;

import java.util.ArrayList;

public class Manager extends Employee {
	
	private ArrayList<Employee> employees;

	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
	}

	protected void addEmployee(Employee emp) {
		employees.add(emp);
	}

	protected ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	@Override
	public String getInfo() {
		super.getInfo();
		String e = "";
		
		for(Employee emp : employees) {
			e += emp.getInfo();
		}
		
		return e;
	}

}
