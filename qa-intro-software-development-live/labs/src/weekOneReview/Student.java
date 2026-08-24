package weekOneReview;

public class Student extends Person {

	String studentId;

	public Student(String name, String email, String studentId) {
		super(name, email);
		this.studentId = studentId;
	}

}
