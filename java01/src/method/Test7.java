package method;

public class Test7 {

	public static void main(String[] args) {
		String a, b, c, d;
		
		a = func("man");
		b = func("woman");
		c = func("male");
		d = func("aaa");
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + func("female"));
	}
	
	static String func(String sex) {
		String result = "";
		
		if (sex.equals("man") || sex.equals("male") )
			result = "남자";
		else if (sex.equals("woman") || sex.equals("female"))
			result = "여자";
		
		return result;
	}

}
