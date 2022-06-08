package test06;

public class Ex1 {

	public static void main(String[] args) {
		Dog dog_a, dog_b;
		Cat cat_a, cat_b;
		
		dog_a = new Dog(2);
		dog_b = new Dog(4);
		
		cat_a = new Cat(2);
		cat_b = new Cat(4);
		
		dog_a.bark();
		dog_b.bark();
		
		cat_a.bark();
		cat_b.bark();
	}

}
