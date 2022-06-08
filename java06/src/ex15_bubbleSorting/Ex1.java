package ex15_bubbleSorting;

public class Ex1 {

	public static void main(String[] args) {
		int[] be = { 50, 40, 30, 20, 10 };
		int t;
		
		for (int i = 1; i < 5; i++) {
			if (be[i - 1] > be[i]) {
				t = be[i - 1];
				be[i - 1] = be[i];
				be[i] = t;
			}
		}
		for (int k : be) {
			System.out.print(k + " ");
		}
		System.out.println();

		for (int i = 1; i < 4; i++) {
			if (be[i - 1] > be[i]) {
				t = be[i - 1];
				be[i - 1] = be[i];
				be[i] = t;
			}
		}
		for (int k : be) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		for (int i = 1; i < 3; i++) {
			if (be[i - 1] > be[i]) {
				t = be[i - 1];
				be[i - 1] = be[i];
				be[i] = t;
			}
		}
		for (int k : be) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		for (int i = 1; i < 2; i++) {
			if (be[i - 1] > be[i]) {
				t = be[i - 1];
				be[i - 1] = be[i];
				be[i] = t;
			}
		}
		for (int k : be) {
			System.out.print(k + " ");
		}
		System.out.println();
	}

}
