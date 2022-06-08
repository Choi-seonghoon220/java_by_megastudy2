package ex01;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10;
		funcA(a);
		System.out.printf("main = %d\n", a);
	}
	static void funcA(int a) {
		funcB(a + 10);
		System.out.printf("funcA = %d\n", a);
	}
	static void funcB(int a) {
		funcC(a + 10);
		System.out.printf("funcB = %d\n", a);
	}
	static void funcC(int a) {
		a = a + 10;
		System.out.printf("funcC = %d\n", a);
	}

}
