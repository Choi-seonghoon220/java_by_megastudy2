package pack5;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			String day, st;
			
			System.out.println( "��¥�� �Է��ϼ���.");
			day = sc.next();
			
			if (day.equals("sun")) {
				st = "�Ͽ���";
			} else if (day.equals("mon")) {
				st = "������";
			} else if (day.equals("tue")) {
				st = "ȭ����";
			} else if (day.equals("wed")) {
				st = "������";
			} else if (day.equals("thu")) {
				st = "�����";
			} else if (day.equals("fri")) {
				st = "�ݿ���";
			} else if (day.equals("sat")) {
				st = "�����";
			} else {
				st = "����";
			}
			System.out.println(st);
	}

}
