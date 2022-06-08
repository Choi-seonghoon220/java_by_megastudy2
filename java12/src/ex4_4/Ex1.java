package ex4_4;

import java.util.function.BinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 1, 4, 6, 7, 2, 3, 7 };
		
		int max = getMax(arr, (a, b) -> a > b ? a : b);
		System.out.println(max);
	}
	static int getMax(Integer[] arr, BinaryOperator<Integer> func) {
		int max = arr[0];
		for (int v : arr) {
			max = func.apply(max, v);
		}
		return max;
	}
}
