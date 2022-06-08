package ex10;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		int[] temp = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arrA, arrB;
		
		arrA = Arrays.copyOf(temp,  3);
		arrB = Arrays.copyOfRange(temp, 2, 6);
		
		view(arrA);
		view(arrB);
	}
	static void view(int[] arr) {
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

}
