package operator_remainder;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("¼ö : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if ( i%2 == 0 && i% 5 == 0) {
				System.out.print( i + " ");
			}
		}
	}

}
