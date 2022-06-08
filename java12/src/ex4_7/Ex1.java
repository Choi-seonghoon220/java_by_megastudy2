package ex4_7;

import java.util.function.IntBinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 1, 4, 6, 7, 2, 3, 7 };
		
		int tot = getTot(arr, (a, b) -> a + b);
		System.out.println(tot);
	}
	static int getTot(Integer[] arr, IntBinaryOperator func) {
		int t = 0;
		for (int v : arr) {
			t = func.applyAsInt(t, v);
		}
		return t;
	}
}
