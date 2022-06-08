package ex14_2_2;

import ex14_1_익명의클래스구현_개체생성.Human;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		Human obj = ex1::methodA;
		obj.view("홍길동");
	}
	void methodA(String name) {
		System.out.println(name);
	}
}
