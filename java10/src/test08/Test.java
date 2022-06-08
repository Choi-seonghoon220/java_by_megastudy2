package test08;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 10, 4, 3, 2, 1 };
		Result result;
		
		result = getResult(arr);
		
		System.out.println("max = " + result.max);
		System.out.println("min = " + result.min);
		System.out.println("avg = " + result.avg);
	}
	static Result getResult(int[] arr) {	// 함수에서 각 값을 다 계산해서 result 에 값을 다 넣어주는 방법도 있음
		Result result = new Result(arr);
		
		return result;
	}
}
