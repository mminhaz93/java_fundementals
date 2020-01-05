package java_fundamentals;

public class FiveStudentsDetailsLoop {

	public static void main(String[] args) {

		String[][] students = { { "Mo", "12", "123 address" }, { "PJ", "22", "567 address" },
				{ "Sabrina", "21", "789 address" }, { "Naimul", "23", "859 address" },
				{ "Musaib", "25", "569 address" } };

		for (int i = 0; i < students.length; i++) {
			System.out.println("Name: " + students[i][0]);
			System.out.println("Age: " + Integer.parseInt(students[i][1]));
			System.out.println("Address: " + students[i][2]);
			System.out.println("*******");
		}
	}

}
