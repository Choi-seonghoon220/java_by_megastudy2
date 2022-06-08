package test03_staticMethod;

public class Ex1 {

	public static void main(String[] args) {
		int a, b;
		
		
		a = Num.max(10, 100, 50);
		b = Num.max(50, 20, 30);
		
		System.out.printf("%d %d %d\n", a, b, Num.min(-3,40,1));
	}

}
