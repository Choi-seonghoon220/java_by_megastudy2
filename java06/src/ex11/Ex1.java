package ex11;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int i, num, n;
		
		for (i = 0; i < 100; i++) {
			System.out.print("Number");
			num = sc.nextInt();
			if (num == -9999) {
				break;
			}
			
			arr[i] = num;
		}
		
		n = i;
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
