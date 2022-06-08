package test10;

public class Ex1 {
	
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 8, 7, 9, 10, 12, 3, 5, 1 };
		int[][] temp;
		
		temp = MyArray.getOddEven(arr);
		
		view("È¦¼ö", temp[0]);
		view("Â¦¼ö", temp[1]);
	}
	static void view(String type, int[] arr) {
		System.out.println(type);
		
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
}
