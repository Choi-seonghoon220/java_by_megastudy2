package pack6;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test, firstInterview, secondInterview, thirdInterview, maxValue, score;
		
		System.out.print("�ʱ����� : ");
		test = Integer.parseInt(sc.nextLine());
		System.out.print("1������ : ");
		firstInterview = Integer.parseInt(sc.nextLine());
		System.out.print("2������ : ");
		secondInterview = Integer.parseInt(sc.nextLine());
		System.out.print("3������ : ");
		thirdInterview = Integer.parseInt(sc.nextLine());
		
		maxValue = firstInterview;
		if (secondInterview > maxValue) {
			maxValue = secondInterview;
		}
		if (thirdInterview > maxValue) {
			maxValue = thirdInterview;
		}
		
		score = (test + maxValue) / 2;
		
		if (score >= 80) {
			System.out.println("�����մϴ�. �հ��ϼ̽��ϴ�.");
		}
		
	}

}
