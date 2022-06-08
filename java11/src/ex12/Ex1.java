package ex12;

import ex11.Animal;
import ex11.AnimalAdapter;
import ex11.Behavior;
import ex11.Cat;
import ex11.Dog;
import ex11.Wolf;

public class Ex1 {

	public static void main(String[] args) {
		Dog dog = new Dog("푸들");
		Cat cat = new Cat("보리", 2, "하품");
		Wolf wolf = new Wolf("그레이윈트", 5);
		
		proce(dog);
		proce(cat);
		proce(wolf);
	}
	static void proce(Behavior obj) {
		obj.view();
		obj.bark();
		obj.sleep();
	}
}
