package pack6;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String[] strNum;
		int num1, num2, num3, num4, maxValue, minValue, result;
		
		System.out.print("네 수를 입력 : ");
		str = sc.nextLine();
		strNum = str.split(" ");
		num1 = Integer.parseInt(strNum[0]);
		num2 = Integer.parseInt(strNum[1]);
		num3 = Integer.parseInt(strNum[2]);
		num4 = Integer.parseInt(strNum[3]);
		
		maxValue = num1;
		
		if( num2>maxValue ) maxValue=num2;
		if( num3>maxValue ) maxValue=num3;
		if( num4>maxValue ) maxValue=num4;
		
		minValue = num1;
		if( num2<minValue ) minValue=num2;
		if( num3<minValue ) minValue=num3;
		if( num4<minValue ) minValue=num4;
		
		
		
		if (num2 > maxValue) {
			maxValue = num2;
		} else {
			minValue = num2;
		}
		
		if (num3 > maxValue) {
			maxValue = num3;
		} else if (num3 < minValue) {
			minValue = num3;
		}
		
		if (num4 > maxValue) {
			maxValue = num4;
		} else if (num4 < minValue) {
			minValue = num4;
		}
		
		result = maxValue - minValue;
		
		System.out.println("결과 : " + result);
	}

}
