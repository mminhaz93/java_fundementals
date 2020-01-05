package oopsAbstractionObject;

class Pig extends AnimalAbstractClass {

	@Override
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	};

	/*
	 * public static void main(String[] args) { // Create a Pig object Pig myPig =
	 * new Pig(); myPig.animalSound(); myPig.sleep(); myPig.age(12);
	 * 
	 * // Create dog object Dog myDog = new Dog(); myDog.animalSound();
	 * myDog.sleep(); myDog.age(5); }
	 */
}
