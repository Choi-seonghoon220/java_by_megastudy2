package test25;

public class Ex1 {

	public static void main(String[] args) {
		Number a;
		int[] arr_odd, arr_even;
		
		a = new Number(6);
		
		arr_odd = a.getOdd();
		arr_even = a.getEven();
		
		view(arr_odd);
		view(arr_even);
	}
	static void view(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
