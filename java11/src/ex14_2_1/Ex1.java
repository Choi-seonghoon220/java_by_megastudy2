package ex14_2_1;

import ex14_1_익명의클래스구현_개체생성.Human;

public class Ex1 {

	public static void main(String[] args) {
		Human obj = Ex1::methodA;
		obj.view("홍길동");
	}
	static void methodA(String name) {
		System.out.println(name);
	}
}
