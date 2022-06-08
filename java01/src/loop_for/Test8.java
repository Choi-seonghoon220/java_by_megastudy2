package loop_for;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentNum, repeatNum, max, tot;
		double avg;

		max = 0;
		tot = 0;
		
		System.out.print("奩犒�蝦� : ");
		repeatNum = sc.nextInt();
		
		
		for (int i = 0; i < repeatNum; i++) {
			System.out.printf("熱%d : ", i + 1);
			currentNum = sc.nextInt();
			
			tot = tot + currentNum;
			
			if (currentNum > max) {
				max = currentNum;
			}
		}
		
		avg = tot / repeatNum;
		
		System.out.printf("譆渤高 = %d, ゎ敕高 = %f", max, avg);
	}
}