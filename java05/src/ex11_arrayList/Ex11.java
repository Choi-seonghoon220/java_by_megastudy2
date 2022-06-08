package ex11_arrayList;

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		ArrayList<Integer> intList;
		
		intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(20);
		intList.add(30);
	
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
	}

}
