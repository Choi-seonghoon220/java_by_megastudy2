package test06;

public class Ex1 {

	public static void main(String[] args) {
		int[] arrA = { 5, 8, 7, 10, -2, 100, 6, 9 };
		int[] temp;
		MyArray arrObj = new MyArray(arrA);
		
		temp = arrObj.getLargeSmall();
		
		System.out.println("max = " + temp[0]);
		System.out.println("max = " + temp[1]);
	}

}
