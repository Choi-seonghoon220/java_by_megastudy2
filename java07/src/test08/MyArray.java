package test08;

public class MyArray {
	static void abs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i] * -1;
			}
		}
	}
}
