package test02;

import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		String[] strArr = { "건길", "남식", "길춘", "형석", "상수" };
		
		view(strArr, System.out::println);
		view(strArr, s -> System.out.print(s + ","));
		view(strArr, Ex1::sub);
	}
	static void sub(String st) {
		System.out.print(st + "^^ ");
	}
	static void view(String[] strArr, Consumer<String> func) {
		for (String s : strArr) {
			func.accept(s);
		}
		System.out.println();
	}
}
