package operator_remainder;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, twoDrainage, threeDrainage, fiveDrainage;
		
		twoDrainage = threeDrainage = fiveDrainage = 0;
		
		System.out.print("수 : "); 
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) twoDrainage = twoDrainage + 1;
			if (i % 3 == 0) threeDrainage = threeDrainage + 1;
			if (i % 5 == 0) fiveDrainage = fiveDrainage + 1;
		}
		
		System.out.println("2의 배수 : " + twoDrainage);
		System.out.println("3의 배수 : " + threeDrainage);
		System.out.println("5의 배수 : " + fiveDrainage);
	}

}
