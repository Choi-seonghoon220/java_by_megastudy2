package ex2_1;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<String> sup = () -> "메가코딩";
		String str = sup.get();
		
		System.out.println(str);
	}

}
