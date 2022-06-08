package method;

public class Test5 {

	public static void main(String[] args) {
		int a, b;
		String c;
		
		a = cal(10, 20, 30);
		b = cal(1, 2, 3);
		c = cal("메가", "코딩", "학원");
		
		System.out.println(a + " " + b + " " + c);
		System.out.println(cal("기가", "코딩", "학원"));
	}
	
	static int cal(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	static String cal(String st1, String st2, String st3) {
		return st1 + st2 + st3;
	}

}
