package test11;

public class Ex1 {

	public static void main(String[] args) {
		Cal a, b;
		
		a = new Cal(20, 10);
		b = new Cal(30, 2);
		
		System.out.printf("add = %d\n", a.add());
		System.out.printf("sub = %d\n", a.sub());
		System.out.printf("mul = %d\n", b.mul());
		System.out.printf("div = %d\n", b.div());
	}
}
