package pack6;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		String[] strValue;
		int num, value1, value2, value3, minValue, saleValue;
		
		System.out.print("수량 : ");
		
		num =  Integer.parseInt( sc.nextLine() );
		
		System.out.print("단가(3개) : ");
		
		str = sc.nextLine();
		strValue = str.split("\\s+");
		
		value1 = Integer.parseInt(strValue[0]);
		value2 = Integer.parseInt(strValue[1]);
		value3 = Integer.parseInt(strValue[2]);
		
		minValue = value1;
		if( value2 < minValue ) minValue = value2;
		if (value3 < minValue ) minValue = value3;
		
		saleValue = num * minValue;
		
		System.out.println("판매금액 = " + saleValue + "원");
	}

}
