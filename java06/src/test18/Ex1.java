package test18;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> kimList, leeList;
		
		kimList = new ArrayList<>();
		leeList = new ArrayList<>();
		
		input(kimList, leeList);
		
		view(kimList);
		view(leeList);
	}
	static void input(ArrayList<String> kimList, ArrayList<String> leeList) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			System.out.print("¿Ã∏ß : ");
			name = sc.nextLine();
			if (name.equals("")) {
				break;
			}
			if (name.startsWith("±Ë")) {
				kimList.add(name);
			}
			if (name.startsWith("¿Ã")) {
				leeList.add(name);
			}
		}
	}
	static void view(ArrayList<String> list) {
		for (String i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
