package ex3_4;

import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		IntToDoubleFunction func = Double::valueOf;
		double value = func.applyAsDouble(5);
	}

}
