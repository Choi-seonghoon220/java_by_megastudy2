package loop_for;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("�� : ");
		num = sc.nextInt();
		
		if (num < 2 || num > 9) {
			System.out.println("��������");
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
	}
}