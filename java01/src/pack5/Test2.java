package pack5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		System.out.println("------------");
		if (avg >= 80) {
			System.out.println("���� : " + tot);
			System.out.println("��� : " + avg);
			System.out.println("�հ�");
		}
			
		System.out.println("------------");
	}

}
