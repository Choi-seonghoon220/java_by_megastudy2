package _02_2562_ÃÖ´ñ°ª;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int indexOfMaxValue, count = 1;
		int maxValue, temp;
		maxValue = 0;
		indexOfMaxValue = count;
		
		for (int i = 0; i < 9; i++) {
			temp = Integer.parseInt(sc.nextLine());
			if (i == 0) {
				maxValue = temp;
			}
			if (maxValue < temp) {
				maxValue = temp;
				indexOfMaxValue = count;
			}
			count++;
		}
		
		System.out.println(maxValue);
		System.out.println(indexOfMaxValue);
	}

}
