package ex14_2_2;

import ex14_1_�͸���Ŭ��������_��ü����.Human;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		Human obj = ex1::methodA;
		obj.view("ȫ�浿");
	}
	void methodA(String name) {
		System.out.println(name);
	}
}
