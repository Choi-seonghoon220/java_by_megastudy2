package pack5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char code;
		String st;
		
		System.out.println("코드를 입력하시오 : ");
		code = sc.next().charAt(0); 
		
		if(code == 'A') {
			st = "초등학생";
		} else if(code == 'B') {
			st = "중학생";
		} else if(code == 'C') {
			st = "고등학생";
		} else {
			st = "코드에러";
		}
		System.out.println( st );
	}

}
