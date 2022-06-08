package test23_toString;

import java.util.Scanner;

public class Ex1 extends Object {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score[] arr = { new Score(501, "kim", 90), new Score(601, "mun", 100),
				new Score(702, "park", 40), new Score(802, "lee", 80),
				new Score(902, "choem", 60) };
		System.out.print("��ȣ : ");
		int num = sc.nextInt();
		
//		Object ss=new Score(1010, "ddd", 20);
//		
//		System.out.println( ss.toString() );
		// Object�� toString()�� �ֱ⶧���� �������� �� ������ ����.
		// ���� ������ �����Ҷ��� Object Ŭ���� ���� Score Ŭ������ toString �޼ҵ尡 �ִ��� ���� ������ �����Ѵ�.
		Score score = search(arr, num);
		
		if (score != null) {
			System.out.println(score  );
//			System.out.println("�̸� : " + score.name);
//			System.out.println("���� : " + score.testScore + "��");
			
		} else {
			System.out.println("ã�� ���� �����ϴ�.");
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
