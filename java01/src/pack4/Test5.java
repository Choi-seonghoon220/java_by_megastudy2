package pack4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String originData;
		String[] arr;
		
		System.out.print("�Է� : ");
		originData = sc.next();
		arr = originData.split(",");
		
		System.out.print("�̸� : " + arr[0] + "  ���� : " + arr[1]);
	}

}
