package test21_return_this;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 5, -5, 20, 30, 8, 7 };
		Data data = new Data(arr);
		
		data.push(9).push(50).push(60).push(4);
		
		System.out.println("ÃÖ´ñ°ª = " + data.getMax());
		System.out.println("ÃÖ¼Ú°ª = " + data.getMin());
		System.out.println("Æò±Õ°ª = " + data.getAvg());
	}
}
