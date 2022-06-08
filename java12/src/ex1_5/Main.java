package ex1_5;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		String[] arr = { "�ް�", "�Ⱑ", "�׶�" };
		view(arr, str -> System.out.println(str));
	}
	static void view(String[] arr, Consumer<String> func) {
		for (String str : arr) {
			func.accept(str);
		}
	}
}
