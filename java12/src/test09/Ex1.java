package test09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 6, 7, 8, 2, 1, 6, 7 };
		int[] temp;
		
		temp = copy_if(arr, v -> v % 2 == 0);
		view(temp, v -> System.out.print(v + " "));
		temp = copy_if(arr, v -> v % 2 == 1);
		view(temp, v -> System.out.print(v + ","));
	}
	static int[] copy_if(int[] arr, IntPredicate func) {
		int[] temp = new int[ arr.length ]; 
		int n=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (func.test(arr[i])) {
				temp[n++] = arr[i];
			}
		}
		return Arrays.copyOf(temp,  n);
		
	}
	static void view(int[] arr,  IntConsumer func) {
		for (int v : arr) {
			func.accept(v);
		}
		System.out.println();
	}
}
