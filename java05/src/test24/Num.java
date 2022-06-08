package test24;

import java.util.ArrayList;
import java.util.Arrays;

public class Num {
	int[] arr;
	
	Num (int[] arr){
		this.arr = arr;
	}
	
	int[] getNum(boolean type) {
		int[] resArr = new int[ this.arr.length ];
		int k=0;
		
		for (int i = 0; i < this.arr.length; i++) {
		    if (type && this.arr[i] % 2 == 1)
		        resArr[k++] = this.arr[i];
		     if (!type && this.arr[i] % 2 == 0)
		    	 resArr[k++] = this.arr[i];
		}
		
        return Arrays.copyOf(resArr, k);	
		
//		String strResult = "";
//		String[] strResultArr;
//		
//		for (int i = 0; i < this.arr.length; i++) {
//			if (type && this.arr[i] % 2 == 1)
//			strResult = strResult + arr[i] + " ";
//			if (!type && this.arr[i] % 2 == 0)
//				strResult = strResult + arr[i] + " ";
//		}
//		
//		strResultArr = strResult.split("\\s+");
//		
//		int[] result = new int[strResultArr.length];
//		
//		for (int i = 0; i < result.length; i++) {
//			result[i] = Integer.parseInt(strResultArr[i]);
//		}
//		
//		return result;
	}
}
