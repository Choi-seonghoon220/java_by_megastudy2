package loop_for;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("�� : ");
		num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("����� �Է��ϼ���");
			System.exit(0);
		}
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("%d   %d\n", i, num - i + 1);
		}
	}
}