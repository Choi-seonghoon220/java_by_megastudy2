package test17_Integer.valueOf;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> oddList, evenList;
		
		oddList = new ArrayList<>();
		evenList = new ArrayList<>();
		
		input(oddList, evenList);
		
		view("Ȧ��", oddList);
		view("¦��", evenList);
	}
	static void input(ArrayList<Integer> oddList, ArrayList<Integer> evenList) {
		Scanner sc = new Scanner(System.in);
		int num;
		String test;
		
		while(true) {
			System.out.print("�� : ");
			test = sc.nextLine();
			if (test.equals("")) {
				break;
			}
			num = Integer.valueOf(test);
			
			if (num <= 0) {
				System.out.println("����� �Է����ּ���.");
				continue;
			}
			if (num % 2 == 1) {
				oddList.add(num);
			}
			if (num % 2 == 0) {
				evenList.add(num);
			}
		}
	}
	
	static void view(String type, ArrayList<Integer> numType) {
		System.out.println(type);
		
		for (int i : numType) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
