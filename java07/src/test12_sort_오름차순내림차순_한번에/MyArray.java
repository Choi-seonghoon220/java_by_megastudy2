package test12_sort_오름차순내림차순_한번에;

import java.util.Arrays;
import java.util.Comparator;

public class MyArray {
	static void sort(int[] arr, boolean type) {
		int temp;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (!type && arr[i] < arr[j] || type && arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

//		if (type) {
//			Arrays.sort(arr);
//		} else if (!type) {
//			for (int i = 0; i < arr.length - 1; i++) {
//				for (int j = i + 1; j < arr.length; j++) {
//					if (type && arr[i] < arr[j] || !type && arr[i]>arr[j]) {
//						temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//				}
//			}
//		}
	}
	static void sort(String[] arr, boolean type) {
		if (type) {
			Arrays.sort(arr);
		} else if (!type) {
			Arrays.sort(arr, new Comp());
//			Arrays.sort(arr, (a, b) -> b.compareTo(a));
		}
	}
}

class Comp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
