package loop_for;

import java.util.Scanner;

public class Test18 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		
		System.out.print("¼ö : ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print(i + 1);
			
			sum = i + 1 + sum;
			
			if (i != (num - 1)) System.out.print(" + ");
		}
		
		System.out.println(" = " + sum);
	}
}
