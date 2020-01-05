package oop;

public class Objects {

	// What is an object
	// https://www.tutorialspoint.com/java/java_object_classes.htm

	/*
	 * Object − Objects have states and behaviors. Example: A dog has states -
	 * color, name, breed as well as behaviors – wagging the tail, barking, eating.
	 * An object is an instance of a class.
	 * 
	 * Class − A class can be defined as a template/blueprint that describes the
	 * behavior/state that the object of its type support.
	 */

	// Creating constructor
	public Objects(int number, String name) {

		System.out.println("I am in constructor");

		// This constructor has one parameter, name.
//		System.out.println("Object Color :" + color);
	}

	public static void main(String[] args) {

		/*
		 * Object creation Syntax: ClassNmae objectName = new ClassName()
		 */

		Objects myObj = new Objects(12, "string");

		System.out.println(myObj.toString());

		System.out.println("I am in main method");
	}

}
