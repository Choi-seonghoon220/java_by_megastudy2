package pack4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String originData;
		String[] arr;
		
		System.out.print("입력 : ");
		originData = sc.next();
		arr = originData.split(",");
		
		System.out.print("이름 : " + arr[0] + "  점수 : " + arr[1]);
	}

}
