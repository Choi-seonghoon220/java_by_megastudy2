package ex25_1variableArguments;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, };
		int a, b, c;
		a = hap(10, 20, 30);
		b = hap(1, 2, 3, 4, 5);
		c = hap(arr);
		System.out.printf("%d %d %d", a, b, c);
	}
	static int hap(int...arr) {
		int h = 0;
		
		for (int i = 0; i < arr.length; i++) {
			h += arr[i];
		}
		
		return h;
	}
}
