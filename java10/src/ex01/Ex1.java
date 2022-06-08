package ex01;

public class Ex1 {

	public static void main(String[] args) {
		Info infoA, infoB;
		
		infoA = new Info();
		infoB = new Info();
		
		infoA.name = "홍길동";
		infoA.age = 30;

		infoB.name = "강성범";
		infoB.age = 15;
		
		System.out.println(infoA.name + " " + infoA.age);
		System.out.println(infoB.name + " " + infoB.age);
	}

}
