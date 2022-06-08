package test20;

import java.util.Arrays;

public class Data {
	int[] arr;
	
	Data(int[] arr){
		this.arr = Arrays.copyOf( arr, arr.length );
	}
	
	int getTot() {
		int tot = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			tot = tot + arr[i];
		}
		
		this.arr[0]=100;
		
		return tot;
	}
	
	int getMax() {
		int max = this.arr[0];
		
		for (int i = 0; i < this.arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	int getMin() {
		int min = this.arr[0];
		
		for (int i = 0; i < this.arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
}
