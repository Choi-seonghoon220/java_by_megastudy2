package ex12;

import ex11.Animal;
import ex11.AnimalAdapter;
import ex11.Behavior;
import ex11.Cat;
import ex11.Dog;
import ex11.Wolf;

public class Ex1 {

	public static void main(String[] args) {
		Dog dog = new Dog("Ǫ��");
		Cat cat = new Cat("����", 2, "��ǰ");
		Wolf wolf = new Wolf("�׷�����Ʈ", 5);
		
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
