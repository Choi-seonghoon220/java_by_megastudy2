package test21;

public class Num {
	int[] arr;
	
	Num(int[] arr){
		this.arr = arr;
	}
	
	void view(boolean type) {
		String test = "";
		
		for (int i = 0; i < this.arr.length; i++) {
			if (type && this.arr[i] % 2 == 0 ) {
				test = test + this.arr[i] + " ";
			}  
			if ( !type && this.arr[i] % 2 == 1 ) {
				test = test + this.arr[i] + " ";
			}  
		}
		System.out.println(test);
	}
}
