package ex09;

public class Test {

	public static void main(String[] args) {
		Info a, b;
		
		a = new Info("홍길동", 60);
		b = new Info("강성범", 40);
		
		System.out.println(a.name + " " + a.age);
		System.out.println(b.name + " " + b.age);
	}

}
