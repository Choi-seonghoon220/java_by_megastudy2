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
			type = "소문자";
		}
		else if (ch.matches("[A-Z]+"))
		{
			type = "대문자";
		}
		else if (ch.matches("[0-9]+"))
		{
			type = "숫자";
		}
		else
		{
			type = "기타";
		}
		
		System.out.println(type);
	}

}
