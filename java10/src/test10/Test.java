package test10;

public class Test {

	public static void main(String[] args) {
		Score[] arr = { new Score("kim", 60),
						new Score("mun", 80),
						new Score("lee", 100),
						new Score("park", 40),
						new Score("hong", 70)
					};
		Score max = getMax(arr);
		max.view();
	}
	static Score getMax(Score[] arr) {
		Score max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max.score < arr[i].score) {
				max = arr[i];
			}
		}
		
		return max;
	}
}
