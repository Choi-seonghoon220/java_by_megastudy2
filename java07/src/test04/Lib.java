package test04;

import java.util.Scanner;

public class Lib {
	static int intInput(String str) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(str);
		
		return sc.nextInt();
	}
}
