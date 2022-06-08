package test01;

import java.util.function.BinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println(get("�ް�", "�ڵ�", (a, b) -> a + b));
		System.out.println(get("ȫ", "�浿", (a, b) -> a + " " + b));
	}
	static String get(String str1, String str2, BinaryOperator<String> func) {
		return func.apply(str1, str2);
	}
}
