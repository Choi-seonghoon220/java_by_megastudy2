package test26;

import java.util.Arrays;

public class Names {
	String[] arr;
	
	Names(String[] arr){
		this.arr = arr;
	}
	
	String[] getNames(String familyName) {
		String[] result = new String[this.arr.length];
		int k = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i].startsWith( familyName ) ) {
				result[k++] = this.arr[i];
			}
		}
		
		return Arrays.copyOf(result, k);
	}
}
