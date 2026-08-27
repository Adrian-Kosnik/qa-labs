package labCodeReview;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class BrokenAuditApp {
	// output will be overridden
	static String OutputFile = "stage0_output.txt";
	static String TEAMname = "AuthTeam";

	public static void doStuff() throws IOException {
		// what is this welcome message? Just say "Audit Result:"
		System.out.println("hello welcome to the audit thing");
		// test data should be in its own test file
		// what is this String[] for?
		String[] users = { "user-100", "user-200", "user-300" };

		Object[][] attempts = { { "user-100", true }, { "user-200", false }, { "user-100", false },
				{ "user-999", true } };
		System.out.println("Working directory output path: " + Path.of(OutputFile).toAbsolutePath());
		String header = "EVENTS FOR SYSTEM";
		// why is this printed 2 times? 
		System.out.println(header + " " + TEAMname);
		System.out.println(header + " " + TEAMname);
		// date time, all results will have the same time, move into for loop
		LocalDateTime ts = LocalDateTime.now();

		FileWriter f = new FileWriter(OutputFile);

		for (Object[] a : attempts) {
			String u = (String) a[0];
			boolean ok = (boolean) a[1];

			String outcome = ok ? "OK" : "NOT_OK";
			// format this, each result on new line
			String line = "time=" + ts + " user=" + u + " result=" + outcome;
			// check for fails first if(!ok)
			if (ok == true) {
				System.out.println("SUCCESS happened for " + u);
			} else {
				System.out.println("fail happened for " + u);
			}

			f.write(line);
		}
		// what is this message? close file, check if its there and then print message
		System.out.println("done. output file maybe created: " + OutputFile);
		f.close();
	}

	public static void main(String[] args) throws IOException {
		doStuff();
	}
}