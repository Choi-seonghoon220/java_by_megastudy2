package loop_for;

import java.util.Scanner;

public class Test3{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("�� : ");
		num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("����� �Է��ϼ���.");
			System.exit(0);
		}
		
		for (int i = 2; i <=  num; i = i + 2) {
			System.out.print(i + " ");
		}
	}
}