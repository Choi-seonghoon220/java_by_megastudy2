package loop_while;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot, num;
		
		tot = 0;
		while(true) {
			System.out.print("Input a Number : ");
			num = sc.nextInt();
			if (num == -999)
				break;
			tot = tot + num;
		}
			System.out.println("Total = " + tot);
	}
}
