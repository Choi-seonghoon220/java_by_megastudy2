package pack4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String firstName, secondName;
		
		System.out.print("¿Ã∏ß : ");
		name = sc.next();
		
		firstName = name.substring(0, 1);
		secondName = name.substring(1);
		System.out.println(firstName + " " + secondName);

	}

}
