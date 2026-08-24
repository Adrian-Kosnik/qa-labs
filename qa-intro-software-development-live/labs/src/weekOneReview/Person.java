package weekOneReview;

public class Person {

	String name;
	String email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getDetails() {
		return name + " " + email;
	}
}
