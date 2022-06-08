package loop_for;

import java.util.Scanner;

public class Test9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeatNum, maxNum, minNum, currentNum;
		
		maxNum = 0;
		minNum = 0;
		
		System.out.print("¹Ýº¹È½¼ö : ");
		repeatNum = sc.nextInt();
		
		for (int i = 0; i < repeatNum; i++) {
			System.out.printf("¼ö%d : ", i + 1);
			currentNum = sc.nextInt();
			
			if (i == 0) {
				maxNum = currentNum;
				minNum = currentNum;
			} else {
				if (currentNum > maxNum) maxNum = currentNum;
				if (currentNum < minNum) minNum = currentNum;
			}
		}
		
		System.out.printf("max = %d, min = %d", maxNum, minNum);
	}
}