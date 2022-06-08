package test12_선택정렬;

public class Test {

	public static void main(String[] args) {
		Score[] arr = { new Score("kim", 60),
				new Score("mun", 80),
				new Score("lee", 100),
				new Score("park", 40),
				new Score("hong", 70)
			};
		sort(arr);
		for (Score score : arr)
			score.view();
	}
	static void sort(Score[] arr) {
		Score temp;
		int k;
		
		for (int i = 0; i < arr.length; i++) {
			k=i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].score > arr[k].score) 
					k=j;
				
			}
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
}
