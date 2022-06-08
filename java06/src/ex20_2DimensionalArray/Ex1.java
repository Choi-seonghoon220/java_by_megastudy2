package ex20_2DimensionalArray;

public class Ex1 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 },
				{3, 5, 9 }, { 100, 200, 300, 400, 500 } };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
//		for (int[] ar : arr) {
//			for (int v : ar) {
//				System.out.print(v + " ");
//			}
//			System.out.println();
//		}
	}
}
