package loop_for;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentNum, repeatNum, max, tot;
		double avg;

		max = 0;
		tot = 0;
		
		System.out.print("�ݺ�Ƚ�� : ");
		repeatNum = sc.nextInt();
		
		
		for (int i = 0; i < repeatNum; i++) {
			System.out.printf("��%d : ", i + 1);
			currentNum = sc.nextInt();
			
			tot = tot + currentNum;
			
			if (currentNum > max) {
				max = currentNum;
			}
		}
		
		avg = tot / repeatNum;
		
		System.out.printf("�ִ� = %d, ��հ� = %f", max, avg);
	}
}