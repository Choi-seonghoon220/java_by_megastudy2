package test07;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 10, 4, 3, 2, 1 };
		ArrayProce array = new ArrayProce(arr);
		System.out.println("max = " + array.getMax());
		System.out.println("min = " + array.getMin());
		System.out.println("avg = " + array.getAvg());
	}

}
