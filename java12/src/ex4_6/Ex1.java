package ex4_6;

import java.util.function.UnaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		Integer[] arr = { 3, 4, 1, 4, 6, 7, 2, 3, 7 };
		
		int tot = getTot(arr, a -> a * a);
		System.out.println(tot);
	}
	static int getTot(Integer[] arr, UnaryOperator<Integer> func) {
		int t = 0;
		for (int v : arr) {
			t = t + func.apply(v);
		}
		return t;
	}
}
