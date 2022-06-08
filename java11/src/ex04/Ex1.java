package ex04;

import ex01.Animal;
import ex01.Dog;
import ex01.Eagle;

public class Ex1 {

	public static void main(String[] args) {
		Animal animal = new Eagle("±î¹Ì", 40);
		Eagle eagle;
		
		eagle = (Eagle) animal;
		System.out.println(eagle.weight);
		eagle.weight = 80;
		eagle.fly();
	}

}
