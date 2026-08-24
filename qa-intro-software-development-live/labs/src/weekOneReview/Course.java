package weekOneReview;

import java.util.HashMap;

public class Course {

	String courseName;
	HashMap<Student, Integer> studentGrade = new HashMap<Student, Integer>();

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(Student s, int grade) {
		studentGrade.put(s, grade);
	}

	public void printStudentList() {
		for (Student name : studentGrade.keySet()) {
			System.out.println(name.getDetails() + " Grade: " + studentGrade.get(name));
		}
	}

}
