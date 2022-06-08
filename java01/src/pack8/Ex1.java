package pack8;

public class Ex1 {

	public static void main(String[] args) {
		String kind;
		int a, b;
		
		a = 100;
		b = 40;
		kind = "ÃÊ";
		
		System.out.println(kind.equals("ÃÊ") || a >= 90 || b >= 50);
		System.out.println(!kind.equals("ÃÊ") || a <= 90 || b <= 20);
	}

}
