package pack5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char code;
		String st;
		
		System.out.println("�ڵ带 �Է��Ͻÿ� : ");
		code = sc.next().charAt(0); 
		
		if(code == 'A') {
			st = "�ʵ��л�";
		} else if(code == 'B') {
			st = "���л�";
		} else if(code == 'C') {
			st = "����л�";
		} else {
			st = "�ڵ忡��";
		}
		System.out.println( st );
	}

}
