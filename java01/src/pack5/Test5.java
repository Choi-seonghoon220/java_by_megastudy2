package pack5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		
		System.out.println("***************");

		if (num == 100) {
			System.out.println("�̸� : ȫ�浿");
			System.out.println("����ó : 524-4248");
		} else if (num == 200) {
			System.out.println("�̸� : �̰Ǳ�");
			System.out.println("����ó : 223-4745");
		} else if (num == 300) {
			System.out.println("�̸� : ������");
			System.out.println("����ó : 222-4444");
		} else {
			System.out.println("�ڵ忡��");
		}
		
		System.out.println("***************");
	}

}
