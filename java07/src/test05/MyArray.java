package test05;

public class MyArray {
	int[] arr;
	
	public MyArray(int[] arr) {
		this.arr = arr;
	}
	
	public int evenHap() {
		int result = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 2 == 0) {
				result = result + this.arr[i];
			}
		}
		
		return result;
	}
	
	public int oddHap() {
		int result = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 2 == 1) {
				result = result + this.arr[i];
			}
		}
		
		return result;
	}
}
