package pack4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r, line, area;
		
		System.out.print("반지름을 입력하시오 : ");
		
		r = sc.nextDouble();
		
		line = 2 * 3.14 * r;
		area = 3.14 * r * r;
		
		System.out.println(String.format("원둘레 = %f\n원넓이 = %f", line, area));
	}

}
