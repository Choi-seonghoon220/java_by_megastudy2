package test05;

public class Ex1 {

	public static void main(String[] args) {
		int k = 999;
		sub(3);
	}
	static void sub(int n) {
		if (n == 0) return;
		System.out.printf("¸Þ : %d\n", n);
		
		sub(n - 1);
		System.out.printf("°¡ : %d\n", n);
	}
}
