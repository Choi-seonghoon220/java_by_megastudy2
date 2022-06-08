package test07;

public class MyString {
	static String join(int[] arr, char type) {
		String result = "";
		
		for (int i : arr) {
			result = result + i + type;
		}
		
		return result.substring(0, result.length() - 1);
	}
	static String join(String[] arr, char type) {
		String result = "";
		
		for (String st : arr) {
			result = result + st + type;
		}
		
		return result.substring(0, result.length() - 1);
	}
}
