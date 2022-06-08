package loop_twice;

import java.util.Scanner;

public class Test33 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int depth;
		
		System.out.print("±Ì¿Ã : ");
		depth = sc.nextInt();
		
		for (int i = 0; i < depth; i++) {
			for (int j = 0; j < (depth - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}