package oopsAbstractionObject;

abstract class AnimalAbstractClass {

	// Contains properties of Animals

	// You can create any method or variables needed for other class to use

	// An abstract class can have both abstract and regular methods:

	// Abstract method
	public abstract void animalSound();

	// regular method
	public void sleep() {
		System.out.println("Zzz");
	}

	public void age(int age) {
		System.out.println("Animal age is : " + age);
	}
}
