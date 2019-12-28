package java_fundamentals;

public class MathArithmeticOperators {
	
	public static void main(String[] args) {
		
		// PEMDAS - (), exponent, *, /, +, -
	
		// 2 + 2 * 3 / 2^3 
		// Output
		// 2 + 2 * 3 / 8
		// 2 + 6 / 8 
		// 2 + 0.75
		// 2.75
		
		 // Define numbers
        int x = 10;
        int y = 3;
        
		
		//Arithmetic Operators
		// Add - " + " 
//		System.out.println("Add numbers: " + (x + y));
//		
//		// Subtract  " - "
//		System.out.println("Subtract numbers: " + (x - y));
//		
//		// Multiplication " * "
//		System.out.println("Multiply numbers: " + (x * y));
		
		// Division " / "
        
        //solution 1
//        double xOne = x;
//        double xTwo = y;
//        
//        double result = xOne / xTwo;
        
        // Solution two

//        double xOne = (double) x;
//        double yOne = (double) y;
        
        // Solution three 
        
        double result = ((double) x) / ((double) y);
        
        
//        System.out.println("Divide x and y : " + result);	
		
		// Remainder " % "
		System.out.println("Get Remainder: " + (x % y));
		
		// Increment (by one) "++"
//		System.out.println("Increment X by 1: " + (++x));
		
		//Decrement (by one) "--"
//		System.out.println("Decrement Y by 1: " + (--y));
		
		// Combine Arithmetic Operators
		// Increment x by one, 
		//decrement y by 1 
		//then i want to multiply them 
		System.out.println("Combine Arithmetic Operators " + ((++x) * (--y)));
		
	}

}
