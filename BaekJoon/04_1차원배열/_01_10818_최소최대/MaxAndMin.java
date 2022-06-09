package _01_10818_최소최대;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String[] numStrArr = sc.nextLine().split(" ");
		int[] numArr = new int[numStrArr.length];
		
		for (int i = 0; i < numStrArr.length; i++) {
			numArr[i] = Integer.parseInt(numStrArr[i]);
		}
		
		int max, min;
		max = min = numArr[0];
		
		for (int v : numArr) {
			if (max < v) {
				max = v;
			}
			if (min > v) {
				min = v;
			}
		}
		System.out.println(min + " " + max);
	}
}
