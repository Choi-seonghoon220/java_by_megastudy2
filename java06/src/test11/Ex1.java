package test11;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 2, 8, 9, 10, 11, 12 };
		
		int[] oddArr = getOdd(arr);
		
		for (int v : oddArr) {
			System.out.print(v + " ");
		}
	}
	static int[] getOdd(int[] arr) {
		int[] result = new int[arr.length];
		int k = 0;
		
		for (int i : arr) {
			if (i % 2 == 1) {
				result[k++] = i;
			}
		}
		
		return Arrays.copyOf(result, k);
	}
}
