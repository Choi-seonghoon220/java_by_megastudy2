package test16;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 0, 7, 5, 0, 8, 6, 0, 0 };
		view(arr);
	}
	static void view(int[] arr) {
		boolean state = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && !state) {
				state = true;
			}
			
			if (state) {
				System.out.print(arr[i]);
			}
		}
	}
}
