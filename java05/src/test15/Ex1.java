package test15;

public class Ex1 {

	public static void main(String[] args) {
		Number a, b;
		
		a = func(100, 20, 3, 40);
		b = func(80, 85, 12, 30);
		
		System.out.println("최대값 = " + a.getMax());
		System.out.println("최소값 = " + b.getMin());
	}

	static Number func(int num1, int num2, int num3, int num4) {
		int max, min;
		
		max = num1;
		if( num2>max ) max = num2;
		if( num3>max ) max = num3;
		if( num4>max ) max = num4;

		min = num1;
		if( num2>min ) min = num2;
		if( num3>min ) min = num3;
		if( num4>min ) min = num4;
		
		return new Number(max, min);
	}
}
