package ex15_input;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int price, amount, total;
		
		System.out.println("ǰ��"); name = sc.next();
		System.out.println("�ܰ�"); price = sc.nextInt();
		System.out.println("����"); amount = sc.nextInt();

		total = price * amount;
		System.out.println(name + "�Ǹűݾ��� " + total);
	}

}
