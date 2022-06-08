package test11_justReturn;

public class MyArray {
	static int find(String[] arr, String name) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				return i;
			}
		}
		
		return -1;
	}
}
