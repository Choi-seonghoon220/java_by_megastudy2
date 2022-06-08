package test09;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr;
		
		arr = getNums();
		
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}
	static int[] getNums() {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[100];
		int num;
		int k = 0;
		
		for (int i = 0; i < 100; i++) {
			System.out.print("¼ö : ");
			num = sc.nextInt();
			
			if (num % 2 == 1 && num != -999) {
				result[k++] = num;
			} else if (num == -999) {
				break;
			}
			
		}
		
		return Arrays.copyOf(result, k);
	}

}
