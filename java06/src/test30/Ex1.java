package test30;

public class Ex1 {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 9, 10, 12, 14, 15, 17, 19 };
		int[] score = { 90, 70, 70, 80, 90, 100, 70, 70, 50, 100 };
		
		sort(num, score);
		view(num, score);
	}
	static void sort(int[] num, int[] score) {
		int temp;
		int length = num.length;
		int sw;
		
		for (int i = 0; i < length-1; i++) {
			sw = 0;
			for (int j = 1; j < length - i; j++) {
				if (score[j] > score[j - 1]) {
					temp = score[j];
					score[j] = score[j - 1];
					score[j - 1] = temp;
					
					temp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp;
					
					sw = 1;
				}
			}
			
			if (sw == 0) {
				break;
			}
		}
		
	}
	static void view(int[] num, int[] score) {
		System.out.println("번호     점수");
		System.out.println("--------");
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%3d  %3d \n", num[i], score[i]);
		}
	}

}
