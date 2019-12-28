package java_fundamentals;

import java.util.Scanner;

public class WeightConvertion {
	public static void main(String[] args) {
		// Define Variables
		// int number = 5; as same as int number; number = 5;
		double weight;
		String weightUnit;
		double convert;

		// Handle if the user puts upper case or lower case L and K as unit

		// To get weight from user we run the following code
		// Create reference to Scanner as an object
		System.out.println("What is your weight ? ");
		weight = input().nextDouble(); // Convert the user entered input to double

		// “Enter valid weight” error if age <0 and greater then 500
		if (weight <= 0 || weight > 500) {
			System.out.println("Enter valid weight!");
		} else {
			System.out.println("If this in Kg enter 'K' or 'L' for pound (lb) ");
			weightUnit = input().nextLine(); // Store user entered weight unit
			// Handle if the user puts upper case or lower case L and K as unit
			// You can't use == to compare strings, need to use build in method equals()
			if (weightUnit.toLowerCase().equals("k")) {
				convert = weight * 2.21;
				System.out.println("Your weight is " + weight + "kg or " + convert + " lb");
			} else if (weightUnit.toLowerCase().equals("l")) {
				convert = weight / 2.21;
				System.out.println("Your weight is " + weight + "lb or " + convert + " kg");
			} else {
				// If unit is wrong (not K, k or L, l) print “Entered invalid unit!” error
				System.out.println("Entered invalid unit!");
			}
		}
	}

	private static Scanner input() {
		return new Scanner(System.in);
	}
}
