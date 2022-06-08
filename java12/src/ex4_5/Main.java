package ex4_5;

import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		UnaryOperator<String> func = s -> s + "´Ô";
		String str = func.apply("È«±æµ¿");
		System.out.println(str);
	}

}
