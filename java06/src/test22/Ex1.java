package test22;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = { 501, 601, 702, 802, 902, 905 };
		String[] nameArr = { "kim", "mun", "park", "lee", "choe", "gang" };
		int[] scoreArr = { 90, 100, 40, 80, 60, 50 };
		int num;
		
		System.out.print("��ȣ : ");
		num = sc.nextInt();
		
		Student student = new Student(numArr, nameArr, scoreArr);
		if (student.numList.contains(num)) {
			int point = student.numList.indexOf(num);
			
			System.out.println("�̸� : " + student.nameList.get(point));
			System.out.println("���� : " + student.scoreList.get(point) + "��");
		} else {
			System.out.println("ã�� ���� �����ϴ�.");
		}
	}

}
