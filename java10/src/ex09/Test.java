package ex09;

public class Test {

	public static void main(String[] args) {
		Info a, b;
		
		a = new Info("ȫ�浿", 60);
		b = new Info("������", 40);
		
		System.out.println(a.name + " " + a.age);
		System.out.println(b.name + " " + b.age);
	}

}
