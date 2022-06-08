package loop_twice;

import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counts, lines;
		
		System.out.print("줄수 : ");
		lines = sc.nextInt();
		System.out.print("열수 : ");
		counts = sc.nextInt();
		
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= counts; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
