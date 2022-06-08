package test09;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { " kim", "m u n", "lee ", " p a rk" };
		
		MyArray.removeSpace(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
