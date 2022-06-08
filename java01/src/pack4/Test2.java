package pack4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sci;
		int tot;
		double avg;
		
		System.out.print("국어 : "); kor = sc.nextInt();
		System.out.print("영어 : "); eng = sc.nextInt();
		System.out.print("수학 : "); mat = sc.nextInt();
		System.out.print("과학 : "); sci = sc.nextInt();
		
		tot = kor + eng + mat + sci;
		avg = tot / 3.0;
		
		System.out.println(String.format("총점 = %d\n평균 = %1.2f", tot, avg));
		
	}

}
