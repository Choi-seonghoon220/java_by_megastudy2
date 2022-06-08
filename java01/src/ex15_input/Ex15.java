package ex15_input;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int price, amount, total;
		
		System.out.println("품명"); name = sc.next();
		System.out.println("단가"); price = sc.nextInt();
		System.out.println("수량"); amount = sc.nextInt();

		total = price * amount;
		System.out.println(name + "판매금액은 " + total);
	}

}
