package ex1_1;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Consumer<String> con = t -> System.out.println(t);
		con.accept("메가코딩");
	}

}
