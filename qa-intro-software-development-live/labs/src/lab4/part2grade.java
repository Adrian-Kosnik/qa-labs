package lab4;

public class part2grade {

	public static void getGrade(int[] marks, String[] students) {

		int i = 0;
		String[] studentGrade = new String[students.length];

		for (int mark : marks) {

			if (mark <= 100 && mark >= 71) {

				studentGrade[i] = getGradeMsg(students[i], "Distnction");

			} else if (mark <= 70 && mark >= 61) {

				studentGrade[i] = getGradeMsg(students[i], "Merit");

			} else if (mark <= 60 && mark >= 50) {

				studentGrade[i] = getGradeMsg(students[i], "Pass");

			} else if (mark < 50) {

				studentGrade[i] = getGradeMsg(students[i], "Fail");

			} else {

				studentGrade[i] = getGradeMsg(students[i], "Invalid");

			}

			i++;

		}

		for (String student : studentGrade) {

			System.out.println(student);

		}

	}

	public static String getGradeMsg(String name, String grade) {

		String msg = "Student Name: " + name + "\nStudent Grade: " + grade + "\n";

		return msg;

	}
	
}
