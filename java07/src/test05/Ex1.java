package test05;

public class Ex1 {

	public static void main(String[] args) {
		int[] arrA = { 1, 3, 4, 6, 8, 10, 12, 7 };
		MyArray arrObj = new MyArray(arrA);
		int a, b;
		
		a = arrObj.evenHap();
		b = arrObj.oddHap();
		
		System.out.println(a + " " + b);
	}

}
