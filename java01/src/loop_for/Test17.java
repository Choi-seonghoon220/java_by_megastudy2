package loop_for;

import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		
		System.out.print("¼ö : ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			sum = sum + i + 1;
		}
		
		System.out.printf("1 + ... + %d = %d", num, sum);
	}
}
