package ex4_1;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		BinaryOperator<String> func = (a, b) -> a + b;
		String str = func.apply("메가", "코딩");
	}

}
