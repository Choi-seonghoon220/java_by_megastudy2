package test10;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		ArrayList<String> lst;
		
		lst = getNames();
		
		for (String st : lst) {
			System.out.print(st + " ");
		}
	}
	static ArrayList<String> getNames() {
		ArrayList<String> result = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			System.out.print("¿Ã∏ß : ");
			name = sc.nextLine();
			
			if (name.equals("")) 
				break;
			
			if (name.startsWith("±Ë")){
				result.add(name);
			}
		}
		
		return result;
	}

}
