package test20;

public class Ex1 {

	public static void main(String[] args) {
		Data a, b;
		int[] arr = { 2, 3, 5, 1, 10, 7 };
		
		a = new Data(arr);
		b = new Data(new int[] { 5, 1, 5, 7, 3 });
		
		System.out.println(a.getTot() + " " + a.getMax());
		System.out.println(b.getTot() + " " + b.getMin());
	}

}
