package ex01;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("ȫ�浿");
		subA();
		System.out.println("������");
		subA();
		
		return;
	}
	static void subA() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		return;
	}
}
