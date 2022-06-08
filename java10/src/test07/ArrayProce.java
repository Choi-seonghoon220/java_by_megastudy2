package test07;

public class ArrayProce {
	int[] arr;
	
	public ArrayProce(int[] arr) {
		this.arr = arr;
	}
	
	int getMax() {
		int max = this.arr[0];
		
		for (int i = 1; i < this.arr.length; i++) {
			if (max < this.arr[i]) {
				max = this.arr[i];
			}
		}
		
		return max;
	}
	
	int getMin() {
		int min = this.arr[0];
		
		for (int i = 1; i < this.arr.length; i++) {
			if (min > this.arr[i]) {
				min = this.arr[i];
			}
		}
		
		return min;
	}
	
	double getAvg() {
		int total = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			total += this.arr[i];
		}
		
		return total * 1.0 / this.arr.length;
	}
}
