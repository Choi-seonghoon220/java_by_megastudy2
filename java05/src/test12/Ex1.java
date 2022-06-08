package test12;

public class Ex1 {

	public static void main(String[] args) {
		Number a, b;
		
		a = new Number(30, 20, 10, 50);
		b = new Number(100, 10, 30, 40);
		
		System.out.println("최대값 = " + a.getMax());
		System.out.println("최소값 = " + a.getMin());
		System.out.println("평균값 = " + a.getAvg());
		
		System.out.println();
		
		System.out.println("최대값 = " + b.getMax());
		System.out.println("최소값 = " + b.getMin());
		System.out.println("평균값 = " + b.getAvg());
	}

}
