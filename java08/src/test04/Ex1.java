package test04;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10;
		func(a);
		System.out.printf("main = %d\n", a);
	}
	static void func(int a) {
		if (a == 40) {
			return;
		}
		
		func(a + 10);
		System.out.printf("func = %d\n", a);
		return;
	}

}
