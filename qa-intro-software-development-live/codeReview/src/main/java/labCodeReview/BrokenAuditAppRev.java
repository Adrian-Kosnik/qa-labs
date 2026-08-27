package labCodeReview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class BrokenAuditAppRev {

	static String TEAMname = "AuthTeam";

	public static void main(String[] args) throws IOException {

		String[] users = { "user-100", "user-200", "user-300" };
		Object[][] attempts = { { "user-100", true }, { "user-200", false }, { "user-100", false },
				{ "user-999", true } };

		ArrayList<String> attemptData = dataFile("/test_data_1.txt");
		FileWriter resFile = resFile("stage1_output.txt");

		runAudit(resFile, attempts);
	}

	public static void runAudit(FileWriter resultFile, ArrayList<String> attemptData) throws IOException {

		for (ArrayList<String> attempt : attemptData) {
			
			String[] at = attempt.split(":");
			
			String user = attempt[0].toString();
			String res = checkResult(attempt);
			resultFile.append(formatResult(user, res));
		}
		resultFile.close();
		System.out.println("Audit Complete");
	}

	static ArrayList<String> dataFile(String path) throws FileNotFoundException {

		ArrayList<String> data = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				data.add(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file.");
		}

		return data;
	}

	static FileWriter resFile(String fileName) {
		try {
			return new FileWriter(fileName, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	static String checkResult(Object[] attempt) {
		boolean ok = (boolean) attempt[1];
		return ok ? "SUCCESS" : "FAIL";
	}

	static String formatResult(String user, String outcome) {

		return "uuid=" + UUID.randomUUID() + " " + "time=" + getDateTime() + " " + "team=" + TEAMname + " " + "user="
				+ user + " " + "result=" + outcome + "\n";

	}

	static String getDateTime() {

		LocalDateTime datetime = LocalDateTime.now();
		ZonedDateTime datetimez = datetime.atZone(ZoneId.systemDefault());
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;

		return dateTimeFormatter.format(datetimez);
	}
}
