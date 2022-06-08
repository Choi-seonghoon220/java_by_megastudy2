package ex17_sortByArrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1 {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 9, 10, 12, 14, 15, 17, 19 };
		
		Arrays.sort(num);
		
		Comparator<Comp> obj = new Comp();
		
		
		for (int v : num) {
			System.out.print(v + " ");
		}
	}

}


class Comp implements Comparator<Comp>{

	@Override
	public int compare(Comp o1, Comp o2) {
		
		return 1;
	}
	
	void print() {
		
	}
}