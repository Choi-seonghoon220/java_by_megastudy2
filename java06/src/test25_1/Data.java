package test25_1;

import java.util.ArrayList;

public class Data {
	ArrayList<Integer> data = new ArrayList<>();
	
	Data append(int num) {
		this.data.add(num);
		
		return this;
	}
	Data append(int...arr) {
		for (int i : arr) {
			this.data.add(i);
		}
		
		return this;
	}
	
	void remove(int num) {
		this.data.remove(num);
	}
	
	int[] toArray() {
		int[] result = new int[this.data.size()];
		Object[] arr = this.data.toArray();
		int n=0;
		for( Object v : arr) {
			result[n++ ] = (Integer)v; 
		}
//		for (int i = 0; i < this.data.size(); i++) {
//			result[i] = this.data.get(i);
//		}
		return result;
	}
	
}
