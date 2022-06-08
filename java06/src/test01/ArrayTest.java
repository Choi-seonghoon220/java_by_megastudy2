package test01;

public class ArrayTest {
	int[] arr;
	
	ArrayTest(int[] arr) {
		this.arr = arr;
	}
	
	void test1() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	void test2() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + " ");
			
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}
	
	void test3() {
		int length = this.arr.length;
		
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[length - i - 1] + " ");
		}
		System.out.println();
	}
	
	void test4() {
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 2 == 0) {
				System.out.print(this.arr[i] + " ");
			}
		}
		System.out.println();
	}
	
	void test5() {
		int count = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	void test6() {
		int sum = 0;
		
		for (int i = 0; i < this.arr.length; i++) {
			sum = sum + this.arr[i];
		}
		System.out.println(sum);
	}
	
	void test7() {
		int count = 0;
		int sum = 0;
		int avg;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] % 3 == 0) {
				sum = sum + this.arr[i];
				count++;
			}
		}
		avg = sum / count;
		
		System.out.println(avg);
	}
}
