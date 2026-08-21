package lab11;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	
	private ArrayList<String> skills;

	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
		this.skills = skills;
	}
	
	protected void addSkill(String skill) {
		skills.add(skill);
	}

	protected ArrayList<String> getSkills() {
		return skills;
	}
	
	public String getInfo() {
		return super.getInfo();
	}

	

}
