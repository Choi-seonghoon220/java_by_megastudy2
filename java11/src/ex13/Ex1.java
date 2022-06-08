package ex13;

import ex11.Behavior;
import ex11.Dog;
import ex11.Cat;

public class Ex1 {

	public static void main(String[] args) {
		Behavior dog = new Dog("푸들");
		Behavior cat = new Cat("보리", 2, "하품");
		
		dog.bark();
		cat.bark();
		
//		String kind = dog.getKind();	// 에러
//		String havit = cat.getHavit();	// 에러
	}

}
