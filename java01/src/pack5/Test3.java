package pack5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int kor, eng, mat, tot;
			double avg;
			
			System.out.println("���� : ");
			kor = sc.nextInt();
			System.out.println("���� : ");
			eng = sc.nextInt();
			System.out.println("���� : ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			System.out.println("-------------");
			System.out.println("��� : " + avg);

			if(avg >= 80) {
				System.out.println("�հ��Դϴ�.");
				System.out.println("�����մϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
				System.out.println("���� ����ϼ���.");
				
			}
			System.out.println("-------------");
				
			
	}

}
