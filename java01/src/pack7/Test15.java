package pack7;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch,type;
		
		System.out.print("Input a character : ");
		ch = sc.nextLine();
		
		if (ch.matches("[a-z]+"))
		{
			type = "�ҹ���";
		}
		else if (ch.matches("[A-Z]+"))
		{
			type = "�빮��";
		}
		else if (ch.matches("[0-9]+"))
		{
			type = "����";
		}
		else
		{
			type = "��Ÿ";
		}
		
		System.out.println(type);
	}

}
