package ex02;

import ex01.Animal;
import ex01.Dog;
import ex01.Eagle;

public class Ex1 {

	public static void main(String[] args) {
		Animal aniA, aniB;
		
		aniB = new Eagle("���", 40);
		aniA = new Dog("����", "Ǫ��");
		
		aniA.eat();
		aniB.eat();
		
//		aniA.weight = 100;
//		aniB.kind = "��Ƽ��";
		
//		aniA.fly();
//		aniB.bark();
		
//		Dog dog = new Animal();
		
		Object obj = new Dog("����", "��Ƽ��");
//		obj.bark();
	}

}
