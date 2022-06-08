package test28;

public class Ex1 {

	public static void main(String[] args) {
		int[] data = { 4, 5, 6, 7, 9, 2, 4, 6, 5, 10 };
		
		sort(data);
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
	static void sort(int[] data) {
		int length = data.length;
		int sw;
		int temp;
		
		
		for (int i = 0; i < length - 1; i++) {
			sw = 0;
			for (int j = 1; j < length; j++) {
				if(data[j - 1] < data[j]) {
					temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
					
					sw = 1;
				}
			}

//			for (int k : data) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
			
			if (sw == 0) {
				break;
			}
		}
	}

}
