package ex03;

public class Ex1 {

	public static void main(String[] args) {
		Info a;
		
		
		a = new Info();
		
		a.name = "ȫ�浿";
		a.age = 60;
		
		sub(a);
		
		System.out.println(a.name + " " + a.age);
	}
	static void sub(Info obj) {
		obj.name = obj.name + "^^";
	}
}
