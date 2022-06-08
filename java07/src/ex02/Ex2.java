package ex02;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("홍길동");
		subA(10);
		System.out.println("문남식");
		subA(20);
		
		return;
	}
	static void subA(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();
		return;
	}
}
