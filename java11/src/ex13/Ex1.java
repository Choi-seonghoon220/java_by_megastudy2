package ex13;

import ex11.Behavior;
import ex11.Dog;
import ex11.Cat;

public class Ex1 {

	public static void main(String[] args) {
		Behavior dog = new Dog("Ǫ��");
		Behavior cat = new Cat("����", 2, "��ǰ");
		
		dog.bark();
		cat.bark();
		
//		String kind = dog.getKind();	// ����
//		String havit = cat.getHavit();	// ����
	}

}
