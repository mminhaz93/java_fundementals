package java_fundamentals;
class Playground {
    
    /* 
    
    public - This is the access modifier of the main method. It has to be public so that java runtime can execute this method.
    static - when java runtime starts, there is no object of the class present. That’s why the main method has to be static so that JVM can load the class into memory and call the main method.
    void- Java main method doesn’t return anything, that’s why it’s return type is void
    main - This is the name of java main method.
    String[] args - Java main method accepts a single argument of type String array
        
    */
    
    // Class naming convention - Pascal - example MyClassName
    // Variable naming conveion - camelCase - example fullName
        
    
    public static void main(String[] args) {
        
        // Syntax 
        // type variableName = value;
        
        // Array String[] = ["1", "2", "3"]
        // How to convert 
        
        String firstName = "Mohammed ";
        String lastName = "Minhaz";
        
        char letter = ' ';
        
        // Initiat variable
        long bigNumber = 2147483648L;
        
        double decimalNumber = 23.22;
        
        boolean passedTest = true;
        
       
        //This line is to print output 
        // System.out.println((myAge + 10));
        //Print full name 
        System.out.println("My name is " + firstName + lastName);
        System.out.println(letter);
        
        
        char ch = 'z';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
        
    }
    
    
}