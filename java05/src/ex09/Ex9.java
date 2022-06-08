package ex09;

public class Ex9 {

	public static void main(String[] args) {
		int[] arrA = { 10, 20, 30, 40 };
		int[] arrB;
		
		arrB = arrA;
		arrB[0] = 100;
		arrB[1] = 200;
		
		for (int i = 0; i < arrA.length; i++){
			System.out.print(arrA[i] + " ");
		}
	}

}