package test12_sort_오름차순내림차순_한번에;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		int[] arrA = { 1, 4, 6, 8, 7, 9, 10, 12, 3, 5, 1 };
		int[] arrB = { 5, 3, 2, 6, 7, 8, 1 };
		String[] arrC = { "10", "5", "2", "20", "4", "1" };
		
		
		MyArray.sort(arrA, true);
		MyArray.sort(arrB, false);
		MyArray.sort(arrC, false);
		
		view(arrA);
		view(arrB);
		view(arrC);
	}
	static void view(int[] arr) {
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	static void view(String[] arr) {
		for (String v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	
	
}
