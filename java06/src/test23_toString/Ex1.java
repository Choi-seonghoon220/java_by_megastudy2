package test23_toString;

import java.util.Scanner;

public class Ex1 extends Object {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score[] arr = { new Score(501, "kim", 90), new Score(601, "mun", 100),
				new Score(702, "park", 40), new Score(802, "lee", 80),
				new Score(902, "choem", 60) };
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
//		Object ss=new Score(1010, "ddd", 20);
//		
//		System.out.println( ss.toString() );
		// Object의 toString()이 있기때문에 컴파일할 때 오류가 없다.
		// 실제 파일을 실행할때는 Object 클래스 전에 Score 클래스에 toString 메소드가 있는지 보고 있으면 실행한다.
		Score score = search(arr, num);
		
		if (score != null) {
			System.out.println(score  );
//			System.out.println("이름 : " + score.name);
//			System.out.println("점수 : " + score.testScore + "점");
			
		} else {
			System.out.println("찾을 수가 없습니다.");
		}
	}
	static Score search(Score[] arr, int num) {
		Score result =  null;
		
		for( Score score: arr )
			if (score.num == num) {
				return score;
			}
		return null;
	}
}
