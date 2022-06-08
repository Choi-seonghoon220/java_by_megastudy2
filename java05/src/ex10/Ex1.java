package ex10;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		
		sub(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void sub(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * 10;
		}
	}
}
