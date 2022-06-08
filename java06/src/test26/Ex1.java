package test26;

public class Ex1 {

	public static void main(String[] args) {
		Score[] arr = { new Score("kim", 80), new Score("mun", 90), new Score("park", 70),
				new Score("hong", 100), new Score("lee", 90), new Score("jun", 60) };
		int r;
		System.out.println("num   score   rank");
		for (int i = 0; i < arr.length; i++) {
			r = arr[i].Rank(arr);
			
			System.out.println(arr[i] + "      " + r);
		}
	}

}
