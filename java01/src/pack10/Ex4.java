package pack10;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String st;
		
		System.out.print("필기점수 : ");
		a = sc.nextInt();
		System.out.print("실기점수 : ");
		b = sc.nextInt();
		
		st = "불합격";
		if (a >= 60 && b >= 80)
		{
			st = "합격";
		}
		
		System.out.println(st);
	}

}
