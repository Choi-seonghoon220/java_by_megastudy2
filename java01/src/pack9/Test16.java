package pack9;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		String type;
		
		ch = sc.nextLine().charAt(0);
		
		if (ch == 'A' || ch == 'a')
			type = "�ʵ��л�";
		else if (ch == 'B' || ch == 'b')
			type = "���м�";
		else if (ch == 'C' || ch == 'c')
			type = "����л�";
		else
			type = "�ڵ忡��";
		
		System.out.println(type);
	}

}
