package ex06;

public class Ex1 {
	
	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		view(ani);
		view(dog);
		view(cat);
		view(cow);
	}
	static void view(Animal obj) {
		obj.bark();
	}
}
