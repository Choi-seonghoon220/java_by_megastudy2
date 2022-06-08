package ex23_referenceArray;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		
		sub(arr);
		System.out.println(arr[0]);
	}
	static void sub(int[] arr) {
		arr[0] *= 10;;
	}
}
