package test02;

public class Gugudan {
	static void view(String str) {
		System.out.println(str);
	}
	
	static void view(int a) {
		if (a >= 2 && a <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(a + " X " + i + " = " + a * i);
			}
		}
	}
}
