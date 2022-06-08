package _12_10952_AsumB5;

import java.util.Scanner;

public class FifthSumAWithB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] numStrArr = new String[2];
		int[] numArr = new int[2];
		
		while(true) {
			numStrArr = sc.nextLine().split(" ");

			numArr[0] = Integer.parseInt(numStrArr[0]);
			numArr[1] = Integer.parseInt(numStrArr[1]);
			
			if (numArr[0] == 0 && numArr[0] == 0) {
				break;
			}
			
			System.out.println(numArr[0] + numArr[1]);
		}
	}
}
