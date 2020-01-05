package oop;

public class OopsConcepts {

	/*
	 * What are the core concepts of OOPS? OOPS core concepts are; 
	 * 1. Abstraction
	 * 
	 * 2.Encapsulation 
	 * 
	 * 3. Polymorphism 
	 * 
	 * 4. Inheritance
	 */

	/*
	 * 1. Abstraction - Hiding internal details and showing functionality is known
	 * as abstraction. For example: phone call, we don't know the internal
	 * processing. In java, we use abstract class and interface to achieve
	 * abstraction.
	 * 
	 * 2. Inheritance - When one object acquires all the properties and behaviors of
	 * parent object is known as inheritance. Meaning if there are class A and B. If
	 * we inherit class A into class B, Class B will have all the properties and
	 * behavior of Class A.
	 * 
	 * 3. Encapsulation - Binding (or wrapping) code and data together into a single
	 * unit is known as encapsulation. It is mostly used for hiding data from users.
	 * We hide data using access modifier such as protected, private, default. For
	 * example, Using protected, variable are only accessible with in class. For one
	 * to used these variables, we would have to create special type of method
	 * called getter and setter method to access the data or variable.
	 * 
	 * 4. Polymorphism - When one task is performed by different ways. We use method
	 * overloading and method overriding to achieve polymorphism. Two types of
	 * Polymorphism, run time and compile time. 1. Method overloading is compile
	 * time polymorphism: In Java, it is possible to define two or more methods of
	 * same name in a class, but the parameters has to be different. For example we
	 * have a method name test(with int x as parameter), we can also have another
	 * method called test(but the parameter is String x this time). 2. Method
	 * overriding is the runtime polymorphism: Child class has the same method as of
	 * parent class. In such cases child class overrides the parent class method
	 * without even touching the source code of the base class. For example, we have
	 * two classes. Class A is the parent class and class B is the child class. In
	 * class A there is method called test, thru method overriding, I can use the
	 * test method from class A into class B without even touching the code. I can
	 * even add more steps in the method.
	 */
	public static void main(String[] args) {

	}

}
