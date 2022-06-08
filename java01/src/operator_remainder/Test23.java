package operator_remainder;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("¼ö : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1)
				System.out.print("¤± ");
			else
				System.out.print("¤· ");
			
		}
	}

}
