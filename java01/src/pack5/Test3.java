package pack5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int kor, eng, mat, tot;
			double avg;
			
			System.out.println("국어 : ");
			kor = sc.nextInt();
			System.out.println("영어 : ");
			eng = sc.nextInt();
			System.out.println("수학 : ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			System.out.println("-------------");
			System.out.println("평균 : " + avg);

			if(avg >= 80) {
				System.out.println("합격입니다.");
				System.out.println("축하합니다.");
			} else {
				System.out.println("불합격입니다.");
				System.out.println("더욱 노력하세요.");
				
			}
			System.out.println("-------------");
				
			
	}

}
