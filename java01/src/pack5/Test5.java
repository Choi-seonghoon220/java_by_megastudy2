package pack5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		
		System.out.println("***************");

		if (num == 100) {
			System.out.println("이름 : 홍길동");
			System.out.println("연락처 : 524-4248");
		} else if (num == 200) {
			System.out.println("이름 : 이건길");
			System.out.println("연락처 : 223-4745");
		} else if (num == 300) {
			System.out.println("이름 : 문남식");
			System.out.println("연락처 : 222-4444");
		} else {
			System.out.println("코드에러");
		}
		
		System.out.println("***************");
	}

}
