package ex4_5;

import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		UnaryOperator<String> func = s -> s + "��";
		String str = func.apply("ȫ�浿");
		System.out.println(str);
	}

}
