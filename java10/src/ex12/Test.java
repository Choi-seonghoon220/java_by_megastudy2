package ex12;

public class Test {

	public static void main(String[] args) {
		Info a, b;
		
		a = new Info("홍길동", 60);
		b = new Info();
		b.name = "강성범";
		
		view(a);
		view(b);
	}
	static void view(Info obj) {
		System.out.println(obj.name + " " + obj.age);
	}
}
