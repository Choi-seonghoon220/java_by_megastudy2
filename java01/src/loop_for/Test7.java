package loop_for;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int reNum, num, sum;
		sum = 0;
		
		System.out.print("반복횟수 : ");
		reNum = sc.nextInt();
		
		System.out.println("---------------");
		for (int i = 0; i < reNum; i++) {
			System.out.print("수" + (i + 1) + " : ");
			num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("---------------");
		
		System.out.println("합계 : " + sum);
	}

}
