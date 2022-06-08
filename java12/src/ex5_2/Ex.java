package ex5_2;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex {

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 1, 4, 6, 7, 2, 3, 7 };
		Integer[] arr2 = getNumber(arr, v -> v % 2 == 0);
		
		for (int v : arr2) {
			System.out.print(v + " ");
		}
	}
	static Integer[] getNumber(Integer[] arr, Predicate<Integer> func) {
		Integer[] temp = new Integer[arr.length];
		int n = 0;
		for (int v : arr) {
			if (func.test(v)) {
				temp[n++] =v;
			}
		}
		return Arrays.copyOf(temp, n);
	}
}
