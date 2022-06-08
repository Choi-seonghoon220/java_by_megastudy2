package pack6;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] strNum;
		int firstNum, secondNum, maxNum;
		
		System.out.print("두 수를 입력 : ");
		str = sc.nextLine();
		strNum = str.split(" ");
		firstNum = Integer.parseInt(strNum[0]);
		secondNum = Integer.parseInt(strNum[1]);
		
		if (firstNum > secondNum) {
			maxNum = firstNum;
		} else {
			maxNum = secondNum;
		}
		
		System.out.println("큰수  : " + maxNum);
	}
}
