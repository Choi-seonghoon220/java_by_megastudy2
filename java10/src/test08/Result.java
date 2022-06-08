package test08;

public class Result {
	int[] arr;
	int max, min, tot = 0;
	double avg;
	
	public Result(int[] arr) {
		this.arr = arr;
		
		max = this.arr[0];
		min = this.arr[0];
		
		for (int i = 0; i < this.arr.length; i++) {
			if (max < this.arr[i]) {
				max = this.arr[i];
			}
			if (min > this.arr[i]) {
				min = this.arr[i];
			}
			
			tot += this.arr[i];
			avg = (double)tot / this.arr.length;
		}
	}
}
