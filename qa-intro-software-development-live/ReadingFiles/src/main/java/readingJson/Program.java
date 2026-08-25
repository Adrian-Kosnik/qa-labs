package readingJson;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Program {

	public static void main(String[] args) throws Exception {

		Gson gson = new Gson();

		String fileName = "src/main/java/customers.json";

		String content = new String(Files.readAllBytes(Paths.get(fileName)));

		Customer[] customers = gson.fromJson(content, Customer[].class);

		System.out.println(customers[0].CustomerID);
	}

}
