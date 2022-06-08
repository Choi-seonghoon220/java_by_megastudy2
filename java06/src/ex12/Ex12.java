package ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lst = new ArrayList<String>();
		String name;
		
		while(true) {
			System.out.print("¿Ã∏ß : ");
			name = sc.nextLine();
			if (name.equals(""))
				break;
			lst.add(name);
		}
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i) + " ");
		}
	}

}
