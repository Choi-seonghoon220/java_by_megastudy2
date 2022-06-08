package test19;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 5, -5, 20, 30, 8, 7, 9, 50, 60, 4 };
		int m;
		
		m = max(arr);
		System.out.println("maximum = " + m);
	}
	static int max(int[] arr) {
		int result = arr[0];
		
		for (int i : arr) {
			if (i > result) {
				result = i;
			}
		}
		return result;
	}
}
