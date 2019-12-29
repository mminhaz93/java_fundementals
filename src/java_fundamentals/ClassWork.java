package java_fundamentals;

public class ClassWork {

	public static void main(String[] args) {

		/*
		 * Do the following: • Count how many words are present in a string. • Display
		 * all the words in upper case • Display all the words in lower case • Verify
		 * presence of "selenium" • Display all the words in reverse order
		 */

		String s = "Welcome to selenium java training";
		// To get numbe of words, I would need to split them by spaces
		String[] words = s.split("\\s"); // same as String[] words = s.split(" "); | returns list of words in an array

		// Count how many words are present in a string.
		System.out.println("There are " + words.length + " words in " + s);

		System.out.println("Words in UPPER case : " + s.toUpperCase());
		System.out.println("Words in UPPER case : " + s.toLowerCase());

		/*
		 * System.out.print("Words in UPPER case : "); for (int i = 0; i < words.length;
		 * i++) { System.out.print(words[i].toUpperCase() + " "); }
		 * 
		 * System.out.println(); // Just to add extra line in the middle
		 * 
		 * System.out.print("Words in lower case : "); for (int i = 0; i < words.length;
		 * i++) { System.out.print(words[i].toLowerCase() + " "); }
		 * 
		 * System.out.println(); // Just to add extra line in the middle
		 */

		// Verify presence of "selenium" in "Welcome to selenium java training"

		System.out.println("Is selenium in the sectence " + s + " : " + s.contains("selenium"));

		// Print words in reverse order
		System.out.println("Print words in reverse order");

		/*
		 * for (int i = 0; i < words.length; i++) { System.out.println(words[i]); }
		 */

		/*
		 * for (int i = 10; i > 0; i--) { System.out.println(i); }
		 */

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}

	}

}
