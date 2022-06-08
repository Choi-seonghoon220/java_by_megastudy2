package test20;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 5, -5, 20, 30, 8, 7, 9, 50, 60, 4 };
		
		Result res = getResult(arr);
		
		System.out.println("ÃÖ´ñ°ª = " + res.max);
		System.out.println("ÃÖ¼Ú°ª = " + res.min);
		System.out.println("Æò±Õ°ª = " + res.avg);
	}
	static Result getResult(int[] arr) {
		Result temporary = new Result(arr);
				
		return temporary;
	}
}
