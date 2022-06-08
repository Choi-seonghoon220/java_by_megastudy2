package test24;

import java.util.ArrayList;
import java.util.Scanner;



public class Ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score(501, "kim", 90));
		list.add(new Score(601, "mun", 100));
		list.add(new Score(702, "park", 40));
		list.add(new Score(802, "lee", 80));
		list.add(new Score(902, "choem", 60));
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		Score score = search(list, num);
		
		if (score != null) {
			System.out.println(score);
		} else {
			System.out.println("찾을 수가 없습니다.");
		}
	}
	static Score search(ArrayList<Score> list, int num) {
		for( Score score : list) {
			if( score.num == num ) {
				return score;
			}
		}
		return null;
	}
}











