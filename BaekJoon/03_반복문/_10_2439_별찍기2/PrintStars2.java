package _10_2439_º°Âï±â2;

import java.util.Scanner;

public class PrintStars2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			for (int j = count - i; j > 1; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
