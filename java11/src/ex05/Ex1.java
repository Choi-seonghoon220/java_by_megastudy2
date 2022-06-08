package ex05;

import ex01.Animal;
import ex01.Dog;
import ex01.Eagle;

public class Ex1 {

	public static void main(String[] args) {
		Eagle eagle = new Eagle("±î¹Ì", 50);
		Dog dog = new Dog("¶ÊÀÌ", "Çªµé");
		
		view(eagle);
		view(dog);
	}
	static void view(Animal ani) {
		ani.eat();
		if (ani instanceof Eagle) {
			Eagle eagle = (Eagle) ani;
			eagle.fly();
		}
		if (ani instanceof Dog) {
			Dog dog = (Dog) ani;
			dog.bark();
		}
	}

}
