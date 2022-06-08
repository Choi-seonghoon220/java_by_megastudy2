package test09;

import java.util.ArrayList;

public class Data {
	static final int max_cnt=1000;
	int[] arr = new int[max_cnt];
	int index = 0;
	
	Data append(int...arr) {
		for( int i=0; i<arr.length; i++ ) {
			this.arr[ index++ ] = arr[i];
		}
		
		return this;
	}
	
	Data remove(int indexOfRemove) {
		
		int[] temp = new int[max_cnt];
		int j=0;
		
		for(int i=0; i<index; i++) {
			if( i!=indexOfRemove )
			    temp[j++] = arr[i];
		}
		index--;
		arr = temp;
//		
//		
//		int[] temp = new int[this.arr.length - 1];
//		
//		for (int i = 0; i < indexOfRemove; i++) {
//			temp[i] = this.arr[i];
//		}
//		
//		for (int i = indexOfRemove; i < this.arr.length - 1; i++) {
//			temp[i] = this.arr[i + 1];
//		}
//		
//		this.arr = temp;
//		
//		index--;

		return this;
	}
	
	int[] toArray() {
		int[] result = new int[index];
		
		for (int i = 0; i < index; i++) {
			result[i] = this.arr[i];
		}
		
		return result;
	}
}
