package test01;

public class Ex1 {

	public static void main(String[] args) {
		int a = -999;
		
		a = hapA(3);
		System.out.printf("total = %d\n", a);
	}
	static int hapA(int a) {
		return a + hapB(a - 1);
	}
	static int hapB(int a) {
		return a + hapC(a - 1);
	}
	static int hapC(int a) {
		return 1;
	}

}
