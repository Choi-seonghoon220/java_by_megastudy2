package loop_for;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int count;
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� : ");
		count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print(name);
			
			if (i == count - 1) System.exit(0);
			
			System.out.print(", ");
		}
	}
}