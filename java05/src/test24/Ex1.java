package test24;

public class Ex1 {

	public static void main(String[] args) {
		Num num;
		int[] arr_odd, arr_even;
		
		num = new Num(new int[] { 2, 3, 5, 1, 10, 7 });
		arr_odd = num.getNum(true);
		arr_even = num.getNum(false);
		
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
