package test13;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Score[] arr = new Score[100];
		int cnt;
		
		cnt = input(arr, 100);
		
		System.out.println("--------------");
		for (int i = 0; i < cnt; i++) {
			arr[i].view();
		}
	}
	static int input(Score[] arr, int num) {
		Scanner sc = new Scanner(System.in);
		String strName, strNum;
		int i;
		
		for (i = 0; i < num; i++) {
			System.out.print("이름 : ");
			strName = sc.nextLine();
			
			if ( strName.equals("")) {
				break;
			}
			
			System.out.print("점수 : " );
			strNum = sc.nextLine();
			
			arr[i] = new Score( strName, Integer.parseInt(strNum) );
		}
		
		return i;
	}
}
