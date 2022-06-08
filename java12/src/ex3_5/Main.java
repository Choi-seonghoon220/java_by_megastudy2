package ex3_5;

import java.util.function.ToDoubleBiFunction;

public class Main {

	public static void main(String[] args) {
		ToDoubleBiFunction<String, String> func = (a, b) -> Double.valueOf(a + b);
		double value = func.applyAsDouble("10", "5");
		
		System.out.println(value);
	}

}
