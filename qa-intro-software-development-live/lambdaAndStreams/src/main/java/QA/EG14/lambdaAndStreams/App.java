package QA.EG14.lambdaAndStreams;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String jsonFile = "src/main/java/products.json";
		
		
		
		try {
			// Read the JSON file
			List<Customer> products = JSONReader.readCustomers(jsonFile);

			// Filter customers by city
			String targetProduct = "Wireless Headphones";
			List<Customer> filteredCustomers = CustomerFilter.filterByCity(products, targetProduct);

			// Display the filtered customers
			System.out.println("Customers in " + targetProduct + ":");
			filteredCustomers
					.forEach(customer -> System.out.println(customer.getName() + " (ID: " + customer.getId() + ")"));
		} catch (IOException e) {
			System.err.println("Error reading the JSON file: " + e.getMessage());
		}

		
		
//		try {
//			// Read the JSON file
//			List<Customer> customers = JSONReader.readCustomers(jsonFile);
//
//			// Filter customers by city
//			String targetCity = "London";
//			List<Customer> filteredCustomers = CustomerFilter.filterByCity(customers, targetCity);
//
//			// Display the filtered customers
//			System.out.println("Customers in " + targetCity + ":");
//			filteredCustomers
//					.forEach(customer -> System.out.println(customer.getName() + " (ID: " + customer.getId() + ")"));
//		} catch (IOException e) {
//			System.err.println("Error reading the JSON file: " + e.getMessage());
//		}
	}

}
