package constructor;

public class Main4 {

	public static void main(String[] args) {
		Score a, b, c, d;
		
		a = new Score("김영미", 90);
		b = new Score("김형석", 100);
		a = new Score("손정우", 80);
		
		c = b;
		b = null;
		
		a.print();
//		b.print();	// 실행도중 에러
		c.print();
//		d.print();	// 에러
	}

}
