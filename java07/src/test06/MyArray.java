package test06;

public class MyArray {
	int[] arr;
	
	public MyArray(int[] arr) {
		this.arr = arr;
	}
	
	public int[] getLargeSmall() {
		int[] result = new int[]{ this.arr[0], this.arr[0] };
		
		for (int v : this.arr) {
			if (v > result[0]) {
				result[0] = v;
			}
			if (v < result[1]) {
				result[1] = v;
			}
		}
		
		return result;
	}
}
