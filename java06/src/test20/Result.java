package test20;

public class Result {
	int max, min;
	double avg;
	int tot;
	
	public Result(int[] arr) {
		max = min = arr[0];
		tot = 0;
		
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
			
			tot = tot + i;
		}
		avg = (double)tot / arr.length;
	}
	
	
}
