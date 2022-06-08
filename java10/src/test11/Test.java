package test11;

public class Test {

	public static void main(String[] args) {
		Score[] arr = { new Score("kim", 60),
				new Score("mun", 80),
				new Score("lee", 100),
				new Score("park", 40),
				new Score("hong", 70)
			};
		
		Score[] res = getResult(arr);
		res[0].view();
		res[1].view();
	}
	static Score[] getResult(Score[] arr) {
		Score[] result = new Score[2];
		
		result[0] = arr[0];
		result[1] = arr[1];
		
		for (int i = 0; i < arr.length; i++) {
			if (result[0].score < arr[i].score) {
				result[0] = arr[i];
			}
			if (result[1].score > arr[i].score) {
				result[1] = arr[i];
			}
		}
		
		return result;
	}
}
