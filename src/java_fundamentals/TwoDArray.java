package java_fundamentals;

public class TwoDArray {

	public static void main(String[] args) {

		/*
		 * int twoDArray [p][q] = {{0,1},{2,3}}; = { p{q}, p{q} }
		 */
		int twoDArray[][] = { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 10 } };

		/*
		 * System.out.print("["); System.out.print(twoDArray[0][0]);
		 * System.out.print(","); System.out.print(twoDArray[0][1]);
		 * System.out.print("]");
		 * 
		 * System.out.print(" , ");
		 * 
		 * System.out.print("["); System.out.print(twoDArray[1][0]);
		 * System.out.print(","); System.out.print(twoDArray[1][1]);
		 * System.out.print("]");
		 * 
		 */

		// Print [0,1] , [2,3]

		for (int p = 0; p < twoDArray.length; p++) {

			// print "[" for [0,1]
			System.out.print("[");

			for (int q = 0; q < twoDArray[p].length; q++) {

				// twoDArray[p][q] => twoDArray[0][0]
				// print "0 1" for [0,1]
				System.out.print(twoDArray[p][q]);

				// this is to prevent from printing comma after the second number

				if (q < twoDArray[p].length - 1) { // Without this it will print [0,1,] but we need to print [0.1]
					// comma after second number isn't needed
					// print "," for [0,1]
					System.out.print(",");
				}
			}
			// print "]" for [0,1]
			System.out.print("]");

			// this is to print comma between two pairs but the last comma isn't needed

			if (p < twoDArray.length - 1) { // Without this it will print [0,1],[1,1], but for last pair I don't want
				// the comma
				System.out.print(", ");
			}
		}
	}

}
