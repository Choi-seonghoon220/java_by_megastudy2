package test08;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int tot = getTotal(arr);
		
		System.out.println(tot);
	}
	static int getTotal(int[] arr) {
		
		class GetTotal {
			int getTotalInClass(int num) {
				if (num == 0) {
					return arr[num];
				}
				
				return getTotalInClass(num - 1) + arr[num];
			}
		}
		
		GetTotal total = new GetTotal();
		
		return total.getTotalInClass(arr.length - 1);
	}
}
