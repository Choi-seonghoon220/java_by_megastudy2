package test07;

import java.util.function.IntPredicate;

public class Ex1 {
	
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 5, 6, 7, 8, 1, 2, 3 };
		
		int cnt1 = getCount(arr, v -> v % 3 == 0);
		int cnt2 = getCount(arr, v -> v % 2 == 0);
		
		System.out.printf("3의 배수 = %d개, 2의 배수 = %d개", cnt1, cnt2);
	}
	static int getCount(int[] arr, IntPredicate func) {
		int count = 0;
		
		for (int v : arr) {
			if (func.test(v)) {
				count++;
			}
		}
		return count;
	}
}
