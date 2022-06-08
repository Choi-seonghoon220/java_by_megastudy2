package ex14_3;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Behavior be = Dog::bark;
		be.action(dog);
	}

}
