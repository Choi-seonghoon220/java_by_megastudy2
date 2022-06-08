package pack6;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test, firstInterview, secondInterview, thirdInterview, maxValue, score;
		
		System.out.print("필기점수 : ");
		test = Integer.parseInt(sc.nextLine());
		System.out.print("1차면접 : ");
		firstInterview = Integer.parseInt(sc.nextLine());
		System.out.print("2차면접 : ");
		secondInterview = Integer.parseInt(sc.nextLine());
		System.out.print("3차면접 : ");
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
			System.out.println("축하합니다. 합격하셨습니다.");
		}
		
	}

}
