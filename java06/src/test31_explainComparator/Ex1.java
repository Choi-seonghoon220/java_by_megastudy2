package test31_explainComparator;

import java.util.Comparator;

public class Ex1 {

	public static void main(String[] args) {
		Score[] arr = { new Score("kim", 80), new Score("mun", 90), new Score("park", 70), new Score("hong", 100),
				new Score("lee", 90), new Score("jun", 60) };

		sort(arr, (a,b)->b.score-a.score );
		//¶÷´Ù½Ä
//		sort(arr, new Comp());
		

		for (Score score : arr) {
			System.out.println(score);
		}
	}

	static void sort(Score[] arr, Comparator<Score> comp) {
		int length = arr.length;
		Score temp;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (comp.compare(arr[i], arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

class Comp implements Comparator<Score>{

	@Override
	public int compare(Score a, Score b) {

		return  b.score - a.score;
	}
	
}