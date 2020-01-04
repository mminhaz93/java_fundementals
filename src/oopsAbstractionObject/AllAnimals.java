package oopsAbstractionObject;

public class AllAnimals {

	public static void main(String[] args) {
		// Create a Pig object
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		myPig.age(12);

		// Create dog object
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
		myDog.age(5);
	}

}
