package loop_for;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("수 : ");
		num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("양수를 입력하세요");
			System.exit(0);
		}
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("%d   %d\n", i, num - i + 1);
		}
	}
}