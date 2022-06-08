package ex3_3;

import java.util.function.DoubleFunction;

public class Main {

	public static void main(String[] args) {
		DoubleFunction<String> func = d -> "ЦђБе = " + d;
		String str = func.apply(95.5);
		
		System.out.println(str);
	}

}
