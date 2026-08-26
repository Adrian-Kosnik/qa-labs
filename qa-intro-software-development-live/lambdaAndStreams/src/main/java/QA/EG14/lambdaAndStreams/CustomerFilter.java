package QA.EG14.lambdaAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerFilter {
	public static List<Customer> filterByCity(List<Customer> customers, String city) {
		return customers.stream().filter(customer -> customer.getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
	}
}
