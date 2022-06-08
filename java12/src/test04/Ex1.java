package test04;

import java.util.function.IntUnaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		int a = get(2, n -> n * n);
		int b = get(10, Ex1::getTotal);	// 10까지의 합
		
		System.out.println(a + " " + b);
	}
	static int get(int num, IntUnaryOperator func) {
		return func.applyAsInt(num);
	}
	static int getTotal(int num) {
		int tot = 0;
		
		for (int i = 1; i <= num; i++) {
			tot += i;
		}
		return tot;
	}
}
