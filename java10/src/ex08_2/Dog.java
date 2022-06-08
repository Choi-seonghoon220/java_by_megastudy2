package ex08_2;

public class Dog {
	void bark() {
		System.out.println("¸Û¸Û");
	}
	void bark(String st) {
		System.out.println(st);
	}
	void bark(String st, int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.print(st);
		}
		System.out.println();
	}
}
