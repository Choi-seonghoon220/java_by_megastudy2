package test10;

import java.util.ArrayList;

public class MyArray {
	static int[][] getOddEven(int[] arr) {
		int[][] result = new int[2][];
		ArrayList<Integer> oddList = new ArrayList<>();
		ArrayList<Integer> evenList = new ArrayList<>();
		
		for (int v : arr) {
			if (v % 2 == 1) {
				oddList.add(v);
			} else {
				evenList.add(v);
			}
		}
		
		int[] oddArr = new int[oddList.size()];
		int[] evenArr = new int[evenList.size()];
		
		for (int i = 0; i < oddList.size(); i++) {
			oddArr[i] = oddList.get(i);
		}
		for (int i = 0; i < evenList.size(); i++) {
			evenArr[i] = evenList.get(i);
		}
		
		result[0] = oddArr;
		result[1] = evenArr;
		
		return result;
	}
}
