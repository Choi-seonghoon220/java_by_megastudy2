package pack5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수어 : ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		System.out.println("------------");
		if (avg >= 80) {
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
			System.out.println("합격");
		}
			
		System.out.println("------------");
	}

}
