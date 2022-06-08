package test10;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { "È«±æµ¿", "ÀÌ°Ç±æ", "¹®³²½Ä", "ÃÖ±æÃá" };
		String[] temp;
		
		temp = transform(arr, s -> s + "´Ô");
		view(temp, System.out::println);
		
		System.out.println("------------------");
		
		temp = transform(arr, s-> s + "^^");
		view(temp, System.out::println);
	}
	static String[] transform(String[] arr, UnaryOperator<String> func) {
		String[] result = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			result[i] = func.apply(arr[i]);
		}
		
		return result;
	}
	static void view(String[] arr, Consumer<String> func) {
		for (int i = 0; i < arr.length; i++) {
			func.accept(arr[i]);
		}
	}
}
