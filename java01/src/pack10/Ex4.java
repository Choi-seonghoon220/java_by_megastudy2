package pack10;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String st;
		
		System.out.print("�ʱ����� : ");
		a = sc.nextInt();
		System.out.print("�Ǳ����� : ");
		b = sc.nextInt();
		
		st = "���հ�";
		if (a >= 60 && b >= 80)
		{
			st = "�հ�";
		}
		
		System.out.println(st);
	}

}
