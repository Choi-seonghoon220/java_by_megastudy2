package test25;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Score[] arr;
		
		arr = getData();
		
		System.out.println("번호    점수");
		System.out.println("--------------");
		
		for (Score score : arr) {
			System.out.println(score);;
		}
	}
	static Score[] getData() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Score> scoreList = new ArrayList<>();
		boolean sw;
		int num, score;
		
		while(true) {
			System.out.print("번호 : ");
			num = sc.nextInt();

			if (num == -999) {
				break;
			}
			sw=false;
			for( Score temp : scoreList) {
				if( temp.num==num) {
					sw=true;
					break;
				}
			}
			if( sw ) {
				System.out.println("이미 존재하는 번호입니다.");
				continue;
			}
			
			System.out.print("점수 : ");
			score = sc.nextInt();

			scoreList.add( new Score(num, score) );  
		}
		
		Score[]  arr = scoreList.toArray( new Score[0] );
		return arr;
	}

}
