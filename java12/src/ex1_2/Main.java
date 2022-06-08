package ex1_2;

import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		BiConsumer<String, Integer> con = (a, b) -> System.out.println(a + " " + b);
		con.accept("메가코딩", 6);
	}

}
