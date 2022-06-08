package loop_for;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("수 : ");
		num = sc.nextInt();
		
		if( !(num >= 1 && num <= 100) ) {
			System.out.println("범위에러");;
			System.exit(0);
		}
		
		for (int i = 1; i<=num; i++ ) 
			  System.out.print( (num-i+1) + " ");
			
	}
}
