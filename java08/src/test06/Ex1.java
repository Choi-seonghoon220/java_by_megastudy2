package test06;

public class Ex1 {

	public static void main(String[] args) {
		int v;
		
		v = fact(5);
		
		System.out.printf("%d! = %d\n", 5, v);
	}
	static int fact(int num) {
		if (num == 1) {
			return 1;
		}
		
		return num * fact(num - 1);
	}
}
