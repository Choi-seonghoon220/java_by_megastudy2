package _13_10951_AsumB4_sc_closeMethod;

import java.util.Scanner;

public class ForthSumAWithB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] numStrArr = new String[2];
		int[] numArr = new int[2];
		int i = 0;
		
		while(sc.hasNext()) {
//			numStrArr = sc.nextLine().split(" ");

			numArr[0] = sc.nextInt();
			numArr[1] = sc.nextInt();
			
			System.out.println(numArr[0] + numArr[1]);
		}
		sc.close();
	}

}
