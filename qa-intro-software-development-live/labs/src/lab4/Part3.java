package lab4;

import java.text.MessageFormat;

public class Part3 {

	public static void multiplicationTable() {

		String name = "multiplicationTable";
		int padding = (56 - name.length()) / 2;
		String centeredName = String.format(MessageFormat.format("%{0}s%s%{1}s", padding, padding), "", name, "");

		System.out.println(centeredName);

		for (int x = 0; x <= 56; x++) {
			System.out.printf("%s", "-");
		}

		for (int row = 0; row <= 10; row++) {

			System.out.println();

			for (int col = 0; col <= 10; col++) {

				if (row == 0 && col == 0) {

					System.out.printf("%5s", "");

				} else if (row == 0) {

					System.out.printf("%5s", "col");

				} else if (col == 0) {

					System.out.printf("%5s", "row");

				} else {

					System.out.printf("%5d", col * row);

				}
			}
		}

		System.out.println("\n");

		for (int x = 0; x <= 56; x++) {
			System.out.printf("%s", "-");
		}

	}

}
