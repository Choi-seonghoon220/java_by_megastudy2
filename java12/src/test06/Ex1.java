package test06;

import java.util.function.IntBinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 6, 7, 8, 1, 2, 3 };
		
		int max = getLimit(arr, (a, b) -> a > b ? a : b);
		int min = getLimit(arr, (a, b) -> a < b ? a : b);
		
		System.out.println(max + " " + min);
	}
	static int getLimit(int[] arr, IntBinaryOperator func) {
		int result = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			result = func.applyAsInt(result, arr[i]);
		}
		return result;
	}
}
