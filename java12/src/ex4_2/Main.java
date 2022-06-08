package ex4_2;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		BinaryOperator<Integer> func = (a, b) -> a + b;
		int v = func.apply(10, 20);
		System.out.println(v);
	}

}
