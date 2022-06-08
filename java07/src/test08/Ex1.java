package test08;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 20, 3, -5, 6, 7, -10, -2 };
		
		MyArray.abs(arr);
		
		for (int v : arr)
			System.out.print(v + " ");
	}

}
