package loop_twice;

import java.util.Scanner;

public class Test31 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstTable, secondTable;
		String[] table;
		
		System.out.print("´Ü : ");
		table = sc.nextLine().split("\\s+");
		firstTable = Integer.parseInt(table[0]);
		secondTable = Integer.parseInt(table[1]);
		
		for (int i = firstTable; i <= secondTable; i++) {
			System.out.printf("* %d´Ü *\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}
		}
	}
}