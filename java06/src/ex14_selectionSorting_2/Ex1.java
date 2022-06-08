package ex14_selectionSorting_2;

public class Ex1 {

	public static void main(String[] args) {
		int[] be = { 100, 900, 6000, 30, 5 };
		
		int temp;
		int n = be.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (be[i] > be[j]) {
					temp = be[i];
					be[i] = be[j];
					be[j] = temp;
				}
			}
			for (int k : be) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
