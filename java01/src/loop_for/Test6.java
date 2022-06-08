package loop_for;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strNum;
		String[] numArr;
		int num1, num2;
		int minNum, maxNum;
		int exNum;
		
		System.out.print("¼ö : ");
		strNum = sc.nextLine();
		
		numArr = strNum.split("\\s+");
		num1 = Integer.parseInt(numArr[0]);
		num2 = Integer.parseInt(numArr[1]);
		
//		minNum = num1;
//		maxNum = num2;
//		
//		if(num1 > num2) {
//			maxNum = num1;
//			minNum = num2;
//		} 	
//		
		if( num1>num2) {
			exNum = num1;
			num1 = num2;
			num2 = exNum;
		}
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
				
				
	}

}
