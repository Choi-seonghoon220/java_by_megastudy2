package pack7;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		
		System.out.print("Input a character : ");
		str = sc.nextLine();
		ch = str.toLowerCase().charAt(0);
		System.out.println(ch);
	}

}
