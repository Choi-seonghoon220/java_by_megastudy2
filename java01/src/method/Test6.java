package method;

public class Test6 {

	public static void main(String[] args) {
		String a, b;
		
		a = func(5);
		b = func(4);
		
		System.out.println(a + " " + b + " " + func(7));
	}
	
	static String func(int num) {
		String result = "¿¡·¯";
		
		if (num % 2 == 0)
			result = "Â¦¼ö";
		else if (num % 2 == 1)
			result = "È¦¼ö";
		
		return result;
	}

}
