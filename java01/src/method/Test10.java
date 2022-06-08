package method;

public class Test10 {

	public static void main(String[] args) {
		int a, b, c, d;
		
		a = cal(10, 20, '+');
		b = cal(30, 10, '-');
		c = cal(10, 5, 'X');
		d = cal(10, 5, '/');
		
		System.out.println(String.format("%d, %d, %d, %d", a, b, c, d));
	}
	
	static int cal(int num1, int num2, char sign) {
		int result = 0;
				
		if (sign == '+')
			result = num1 + num2;
		else if (sign == '-')
			result = num1 - num2;
		else if (sign == 'X')
			result = num1 * num2;
		else if (sign == '/')
			result = num1 / num2;
		
		return result;
	}

}
