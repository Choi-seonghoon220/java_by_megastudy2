package ex13_selectionSorting;

public class Ex1 {

	public static void main(String[] args) {
		int[] be = { 100, 900, 6000, 30, 5 };
		
		int t;
		
		for (int i = 1; i < 5; i++) {
			if (be[0] > be[i]) {
				t = be[0];
				be[0] = be[i];
				be[i] = t;
			}
		}
		
		for (int i : be) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 2; i < 5; i++) {
			if (be[1] > be[i]) {
				t = be[1];
				be[1] = be[i];
				be[i] = t;
			}
		}
		
		for (int i : be) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 3; i < 5; i++) {
			if (be[2] > be[i]) {
				t = be[2];
				be[2] = be[i];
				be[i] = t;
			}
		}
		
		for (int i : be) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 4; i < 5; i++) {
			if (be[3] > be[i]) {
				t = be[3];
				be[3] = be[i];
				be[i] = t;
			}
		}
		
		for (int i : be) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
