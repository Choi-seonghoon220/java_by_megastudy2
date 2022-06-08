package method;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		int a, b, c, d;
		
		a = input("국어");
		b = input("영어");
		c = input("수학");
		
		d = a + b + c;
		
		System.out.println("총점 = " + d);
	}

	static int input(String score) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(score + " : ");
		return sc.nextInt();
	}
}
