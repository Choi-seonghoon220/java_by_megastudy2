package method;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		int a, b, c, d;
		
		a = input("����");
		b = input("����");
		c = input("����");
		
		d = a + b + c;
		
		System.out.println("���� = " + d);
	}

	static int input(String score) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(score + " : ");
		return sc.nextInt();
	}
}
