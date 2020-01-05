package oopsAbstractionObject;

public class AllAnimals {

	public AllAnimals() {
		System.out.println("I hate cat");
	}

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
