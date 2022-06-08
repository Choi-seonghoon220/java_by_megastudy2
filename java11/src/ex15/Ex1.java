package ex15;

public class Ex1 {

	public static void main(String[] args) {
		//람다식 표현
		Human objA = (name, age) -> System.out.println(name + " " + age);
		Human objB = (name, age) -> System.out.println(name + "~~~" + age);
		
		objA.view("홍길동", 60);
		objB.view("고도희", 23);
	}

}
