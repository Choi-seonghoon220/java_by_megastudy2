package ex02;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7 };
		
		sort(arr);
		
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}
	static void sort(int[] arr) {
		class Temp {
			void swap(int i, int j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
			void qsort(int left, int right) {
				if (left >= right)
					return;
				
				int P = left;
				int L = left + 1;
				int R = right;
				
				while (L <= R) {
					while (L <= right && arr[L] <= arr[P])
						L++;
					while (R > left && arr[R] >= arr[P])
						R--;
					if (L > R)
						swap(P, R);
					else
					swap(L, R);
				}
				qsort(left, R - 1);
				qsort(R + 1, right);
			}
		}
		Temp temp = new Temp();
		temp.qsort(0,  arr.length - 1);
	}
}
