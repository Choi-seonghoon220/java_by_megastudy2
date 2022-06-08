package test21_return_this;

import java.util.ArrayList;

public class Data {
	ArrayList<Integer> numList = new ArrayList<>();
	
	Data(int[] arr) {
		for (int i : arr) {
			numList.add(i);
		}
	}
	
	Data push(int num) {
		numList.add(num);
		return this;
	}
	
	int getMax() {
		int max = this.numList.get(0);
		
		for (int i : this.numList) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	int getMin() {
		int min = this.numList.get(0);
		
		for (int i : numList) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	double getAvg() {
		int tot = 0;
		
		for (int i : numList) {
			tot = tot + i;
		}
		
		return tot * 1.0 / this.numList.size();
	}

}
