package method;

public class Test11 {

	public static void main(String[] args) {
		int a, b, c, d;
		
		a = max(30, 4, 5, 32);
		b = max(4, 3, 2, 1);
		c = max(3, 30, 4, 7);
		d = max(4, 5, 10, 6);
		
		System.out.println(String.format("%d, %d, %d, %d", a, b, c, d));
		System.out.printf("%d, %d, %d, %d", a, b, c, d);
	}
	
	static int max(int num1, int num2, int num3, int num4) {
		int maxValue;
		
		maxValue = num1;
		if (num2 > maxValue) maxValue = num2;
		if (num3 > maxValue) maxValue = num3;
		if (num4 > maxValue) maxValue = num4;
		
		return maxValue;
		
	}

}
