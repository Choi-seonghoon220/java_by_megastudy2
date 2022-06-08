package test23;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Score> list;
		
		list = new ArrayList<Score>();
		
		list.add(new Score("이정후", 50, 90, 70));
		list.add(new Score("신지환", 100, 50, 90));
		list.add(new Score("이재올", 80, 60, 50));
		list.add(new Score("김준우", 90, 90, 60));
		
		view(list);
	}

	static void view(ArrayList<Score> list) {
		System.out.println("이름      국어  영어   수학    총점    평균");
		System.out.println("=========================");
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).view();
		}
	}
}
