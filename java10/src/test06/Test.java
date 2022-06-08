package test06;

public class Test {

	public static void main(String[] args) {
		Shape a, b;
		a = new Shape("¤±");
		b = new Shape("¤·");
		
		for (int i = 1; i <= 5; i++) {
			a.draw(i);
		}
		for (int i = 1; i <= 5; i++) {
			b.draw(6 - i);
		}
	}

}
