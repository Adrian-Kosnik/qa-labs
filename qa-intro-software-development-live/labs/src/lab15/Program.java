package lab15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<String>();
		ArrayList<String> trainers = new ArrayList<String>();

		try {
			courses = readCSV("src/course.txt");
			trainers = readCSV("src/trainer.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String item : courses) {
			try {
				appendFile("src/trainersAndCourses.txt", item);
				appendFile("src/trainersAndCourses.txt", "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(String item : trainers) {
			try {
				appendFile("src/trainersAndCourses.txt", item);
				appendFile("src/trainersAndCourses.txt", "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

	private static ArrayList<String> readCSV(String inFile) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(inFile));
		ArrayList<String> itemArr = new ArrayList<String>();
		String line;

		while ((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			for (String t : temp) {
				itemArr.add(t);
			}
		}

		br.close();
		return itemArr;
	}

	public static void appendFile(String inFile, String line) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(inFile, true));
		out.write(line);
		out.close();
	}

}
