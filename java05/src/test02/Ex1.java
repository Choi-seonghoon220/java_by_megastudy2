package test02;

public class Ex1 {

	public static void main(String[] args) {
		Info a, b;
		
		a = new Info("kim", "111-222");
		b = new Info("lee", "333-444");
		
		System.out.println(a.name + " " + a.phone);
		System.out.println(b.name + " " + b.phone);
	}

}
