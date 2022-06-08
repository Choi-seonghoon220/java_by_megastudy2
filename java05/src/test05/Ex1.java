package test05;

public class Ex1 {

	public static void main(String[] args) {
		Score a, b;
		
		a = new Score("kim", 100, 50, 60);
		b = new Score("mun", 40, 60, 70);
		
		a.view();
		System.out.printf("รัมก = %d\n", a.getTot());
		
		b.view();
		System.out.printf("รัมก = %d\n", b.getTot());
	}

}
