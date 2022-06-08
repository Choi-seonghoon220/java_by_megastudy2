package method;

public class Test2 {

	public static void main(String[] args) {
		test(80);
		test(40);
	}
	
	static void test(int score) {
		if (score >= 80)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
