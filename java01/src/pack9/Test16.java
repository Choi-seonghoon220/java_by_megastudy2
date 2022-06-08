package pack9;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		String type;
		
		ch = sc.nextLine().charAt(0);
		
		if (ch == 'A' || ch == 'a')
			type = "초등학생";
		else if (ch == 'B' || ch == 'b')
			type = "중학셍";
		else if (ch == 'C' || ch == 'c')
			type = "고등학생";
		else
			type = "코드에러";
		
		System.out.println(type);
	}

}
