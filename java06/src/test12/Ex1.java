package test12;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 2, 8, 9, 10, 11, 12 };
		
		Result res = divideNum(arr);
		
		view("È¦¼ö", res.odd);
		view("Â¦¼ö", res.even);
	}
	static Result divideNum(int[] arr) {
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for (int i : arr) {
			if (i % 2 == 1) {
				odd.add(i);
			} else {
				even.add(i);
			}
		}
		
		Result res = new Result(odd, even);
		
		return res;
	}
	
	static void view(String strType, ArrayList<Integer> type) {
		System.out.println("<" + strType + ">");
		
		for (int i : type) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
