package test25;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
	int[] arr;
	Scanner sc = new Scanner(System.in);
	
	Number (int count){
		this.arr = new int[count];
		
		for (int i = 0; i < count; i++) {
			System.out.print("¼ö" + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
	}
	
	int[] getOdd() {
		int[] result = new int[this.arr.length];
		int k = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 2 == 1) {
				result[k++] = arr[i];
			}
		}
		
		return Arrays.copyOf(result, k);
	}
	
	int[] getEven() {
		int[] result = new int[this.arr.length];
		int k = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 2 == 0) {
				result[k++] = arr[i];
			}
		}
		
		return Arrays.copyOf(result, k);
	}
}
