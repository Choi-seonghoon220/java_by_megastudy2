package loop_for;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("�� : ");
		num = sc.nextInt();
		
		if( !(num >= 1 && num <= 100) ) {
			System.out.println("��������");;
			System.exit(0);
		}
		
		for (int i = 1; i<=num; i++ ) 
			  System.out.print( (num-i+1) + " ");
			
	}
}
