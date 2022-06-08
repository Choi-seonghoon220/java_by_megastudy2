package pack4;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputString, objectString, changeString, resultString;
		
		System.out.print("입력 : ");
		inputString = sc.next();
		System.out.print("바꿀 문자 : ");
		objectString = sc.next();
		System.out.print("치환문자 : ");
		changeString = sc.next();
		
		resultString = inputString.replaceAll(objectString, changeString);
		
		System.out.println(resultString);
	}

}
