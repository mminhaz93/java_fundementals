package java_fundamentals;

import java.util.Scanner;

public class WeightConvertTwo {

	public static void main(String[] args) {

		int age;
		System.out.println("Enter valid age");
		age = new Scanner(System.in).nextInt();

		if ((age > 100) || (age < 1)) {
			System.out.println("ERROR Please enter a valid age");
		}

		double weight;
		String weightUnit;
		double convert;

		// Create reference to Scanner as an object
		System.out.println("What is your weight ? ");
		weight = new Scanner(System.in).nextDouble(); // Convert the user entered input to double

		System.out.println("If this in Kg enter 'K' or 'L' for pound (lb) ");
		weightUnit = new Scanner(System.in).nextLine();

		// You can't use == to compare strings, need to use build in method equals()
		if (weightUnit.equals('K')) {
			System.out.println("Weight in Kg");

		} else if (weightUnit.equals('L')) {
			System.out.println("Weight in lb");

		} else {
			System.out.println("Error");
		}
	}
}
