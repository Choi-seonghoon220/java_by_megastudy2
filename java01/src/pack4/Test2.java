package pack4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sci;
		int tot;
		double avg;
		
		System.out.print("���� : "); kor = sc.nextInt();
		System.out.print("���� : "); eng = sc.nextInt();
		System.out.print("���� : "); mat = sc.nextInt();
		System.out.print("���� : "); sci = sc.nextInt();
		
		tot = kor + eng + mat + sci;
		avg = tot / 3.0;
		
		System.out.println(String.format("���� = %d\n��� = %1.2f", tot, avg));
		
	}

}
