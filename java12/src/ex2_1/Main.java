package ex2_1;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<String> sup = () -> "�ް��ڵ�";
		String str = sup.get();
		
		System.out.println(str);
	}

}
