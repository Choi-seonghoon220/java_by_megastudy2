package test12;

public class Ex1 {

	public static void main(String[] args) {
		Number a, b;
		
		a = new Number(30, 20, 10, 50);
		b = new Number(100, 10, 30, 40);
		
		System.out.println("�ִ밪 = " + a.getMax());
		System.out.println("�ּҰ� = " + a.getMin());
		System.out.println("��հ� = " + a.getAvg());
		
		System.out.println();
		
		System.out.println("�ִ밪 = " + b.getMax());
		System.out.println("�ּҰ� = " + b.getMin());
		System.out.println("��հ� = " + b.getAvg());
	}

}
