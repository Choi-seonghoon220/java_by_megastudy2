package ex12;

public class Test {

	public static void main(String[] args) {
		Info a, b;
		
		a = new Info("ȫ�浿", 60);
		b = new Info();
		b.name = "������";
		
		view(a);
		view(b);
	}
	static void view(Info obj) {
		System.out.println(obj.name + " " + obj.age);
	}
}
