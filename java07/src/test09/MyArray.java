package test09;

public class MyArray {
	static void removeSpace(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replace(" ", "");
		}
	}
}
