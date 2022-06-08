package test03;

public class Ex1 {

	public static void main(String[] args) {
		Score a, b;
		
		a = new Score("홍길동", 60, 70, 80);
		b = new Score("이건길", 70, 100, 60);
		
		a.view();
		b.view();
	}

}
