package test04;

public class Ex1 {

	public static void main(String[] args) {
		int n = Lib.intInput("¼öÀÔ·Â : " );
		
		double v = Num.fact(n);
		
		System.out.printf("%d! = %.0f\n", n, v);
	}

}
