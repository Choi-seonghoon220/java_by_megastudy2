package test02;

public class Ex1 {

	public static void main(String[] args) {
		int a;
		
		a = hap(2);
		System.out.printf("%d", a);
	}
	static int hap(int a) {
		if (a == 1) {
			return 1;
		}
		return a + hap(a - 1);
	}
}
