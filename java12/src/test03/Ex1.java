package test03;

import java.util.function.IntUnaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		IntUnaryOperator func1 = v -> {
			int tot = 0;
			for (int i = 1; i <= v; i++) {
				tot += i;
			}
			return tot;
		};
		IntUnaryOperator func2 = v -> {
			int tot = 1;
			for (int i = 1; i <= v; i++) {
				tot *= i;
			}
			return tot;
		};
		System.out.println(func1.applyAsInt(10));	// 10까지의 합
		System.out.println(func2.applyAsInt(5));	// 10!
	}

}
