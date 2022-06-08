package state_continue;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot, max, num;
		
		tot = 0;
		max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Input Num : ");
			num = sc.nextInt();
			
			if (num >= 0) {
				if (num > max)
					max = num;
				tot = tot + num;
			}
		}
		
		System.out.println("max = " + max);
		System.out.println("avg = " + (tot / 10));
	}

}
