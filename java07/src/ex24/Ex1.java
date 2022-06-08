package ex24;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr;
		
		arr = sub();
		System.out.println(arr[0] + " " + arr[1]);
	}
	static int[] sub() {
		int[] temp = {10, 20};
		
		return temp;
	}
}
