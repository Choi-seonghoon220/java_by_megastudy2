package ex03;

import ex01.Animal;
import ex01.Dog;
import ex01.Eagle;

public class Ex1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Eagle eagle;
		
		eagle = (Eagle) animal;	// 실행에러	//Animal엔 없는게 Eagle에 있음 그래서 Eagle 개체로 바꿀 수 없음
	}

}
