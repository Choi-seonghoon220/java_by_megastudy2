package test13;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 45, 6, 7, 8, 9, 10, 12, 13, 15 };
		int i, t;
		int[] newArr;
		
		newArr = getReverse(arr);
		
		for (int v : newArr) {
			System.out.print(v + " ");
		}
	}
	static int[] getReverse(int[] arr) {
		int length = arr.length;
		int[] result = new int[length];
		
		for (int i = 0; i < length; i++) {
			result[i] = arr[length - i - 1];
		}
		
		return result;
	}

}
