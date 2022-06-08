package test41;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5, 6, 7, 10, 2, 4, 5, 6, 7, 3, 2, 9, 5, 7 };
		int[][] res;
		
		res = divideNum(arr);
		
		view("È¦¼ö", res[0]);
		view("Â¦¼ö", res[1]);
	}
	
	static int[][] divideNum(int[] arr) {
		int[][] result = new int[2][];
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		int[] oddArr, evenArr;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		
		oddArr = new int[odd.size()];
		evenArr = new int[even.size()];
		
		for (int i = 0; i < odd.size(); i++) {
			oddArr[i] = odd.get(i);
		}
		
		for (int i = 0; i < even.size(); i++) {
			evenArr[i] = even.get(i);
		}
		
		result[0] = oddArr;
		result[1] = evenArr;

		return result;
	}
	
	static void view(String str, int[] arr) {
		System.out.println("<" + str + ">");
		
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
}
