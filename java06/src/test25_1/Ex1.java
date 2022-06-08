package test25_1;

public class Ex1 {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.append(10, 20, 30);
		data.append(40, 50).append(60);
		data.remove(0);
		
		int[] arr = data.toArray();
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
