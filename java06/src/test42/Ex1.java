package test42;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { "ÀÌ°Ç±æ", "±èÇü¹Î", "ÀÌÁ¤ÈÄ", "±è¹ÎÈ£", "°­¼º¹ü", "±èÇü¼®", "±è°ü¼º", "ÀÌ°æ¼ø" };
		
		ArrayList<ArrayList<String>> list; 
		
		list = divideName(arr);
		view(list.get(0));
		view(list.get(1));
	}
	static ArrayList<ArrayList<String>> divideName(String[] arr) {
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		ArrayList<String> leeList = new ArrayList<>();
		ArrayList<String> kimList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].charAt(0) == '±è') {
				kimList.add(arr[i]);
			} else if (arr[i].charAt(0) == 'ÀÌ') {
				leeList.add(arr[i]);
			}
		}
		result.add(kimList);
		result.add(leeList);
		
		return result;
	}
	static void view(ArrayList<String> listByName) {
		for (String s : listByName) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
