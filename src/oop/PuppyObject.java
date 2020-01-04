package oop;

public class PuppyObject {

	// This class contains properties of a puppy

	int puppyAge;

	// Constructor - name has to be same as the class name
	// All parameters defined in constructor needs to be filled

	public PuppyObject(String name) {
		// This constructor has one parameter, name.
		System.out.println("Name chosen is : " + name);
	}

	// I want to be able to set puppy's age
	public void setAge(int age) {
		puppyAge = age;
	}

	// I want to be able to get puppy's age
	public int getAge() {
		System.out.println("Puppy's age is : " + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// How to use the an object

		/*
		 * Object creation Syntax: ClassNmae objectName = new ClassName()
		 */

		PuppyObject myPuppy = new PuppyObject("Tommy");
		// PuppyObject myPuppyTwo = new PuppyObject("Cat");

		/* Call class method to set puppy's age */
		myPuppy.setAge(2);

		/* Call another class method to get puppy's age */
		myPuppy.getAge();

		PuppyObject myPuppyTwo = new PuppyObject("Cat");
		myPuppyTwo.setAge(5);
		myPuppyTwo.getAge();

	}
}
