package pack4;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputString, objectString, changeString, resultString;
		
		System.out.print("�Է� : ");
		inputString = sc.next();
		System.out.print("�ٲ� ���� : ");
		objectString = sc.next();
		System.out.print("ġȯ���� : ");
		changeString = sc.next();
		
		resultString = inputString.replaceAll(objectString, changeString);
		
		System.out.println(resultString);
	}

}
