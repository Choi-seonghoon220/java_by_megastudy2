package ex3_1;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<String, Integer> func = Integer::parseInt;
		int v = func.apply("100");
	}

}
