package method;

public class Test8 {

	public static void main(String[] args) {
		double a, b;
		
		a = getArea(56.7);
		b = getArea(12.5);
		
		System.out.println(a);
		System.out.println(b);
	}
	
	static double getArea(double r) {
		return r * r * 3.14;
	}
}
