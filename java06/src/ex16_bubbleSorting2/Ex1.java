package ex16_bubbleSorting2;

public class Ex1 {

	public static void main(String[] args) {
		int[] be = { 50, 40, 30, 20, 10 };
		int t;
		int n = be.length;
		int sw;
		
		for (int i = 0; i < n - 1; i++) {
			sw = 0;
			for (int j = 1; j < n-1; j++) {
				if (be[j - 1] > be[j]) {
					t = be[j - 1];
					be[j - 1] = be[j];
					be[j] = t;
					sw = 1;
				}
			}
			if (sw == 0) {
				break;
			}
		}
	}

}
