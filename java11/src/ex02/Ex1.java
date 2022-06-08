package ex02;

import ex01.Animal;
import ex01.Dog;
import ex01.Eagle;

public class Ex1 {

	public static void main(String[] args) {
		Animal aniA, aniB;
		
		aniB = new Eagle("까미", 40);
		aniA = new Dog("똘이", "푸들");
		
		aniA.eat();
		aniB.eat();
		
//		aniA.weight = 100;
//		aniB.kind = "말티즈";
		
//		aniA.fly();
//		aniB.bark();
		
//		Dog dog = new Animal();
		
		Object obj = new Dog("초코", "말티즈");
//		obj.bark();
	}

}
