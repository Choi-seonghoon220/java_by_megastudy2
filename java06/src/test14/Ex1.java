package test14;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		
		int n = arr.length;
		
		System.out.print("¹è¿­ ÀÎµ¦½º : ");
		int idx = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(arr[idx] + " ");
			if (i % 5 == 0)
				System.out.println();
			idx = (idx + 1) % n;
		}
	}
}
