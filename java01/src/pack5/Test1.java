package pack5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		double avg;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		avg = (kor+eng+mat)/3.0;
		
		System.out.println("---------------");
		
		if(avg >= 80)
			System.out.println("합격");
		
		System.out.println("---------------");
		
	}

}
