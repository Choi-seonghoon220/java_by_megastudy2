package ex06;

public class Cow extends Animal {
	//오버로딩
	void bark(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.println("음메");
		}
	}
}
