package ex14_2_1;

import ex14_1_�͸���Ŭ��������_��ü����.Human;

public class Ex1 {

	public static void main(String[] args) {
		Human obj = Ex1::methodA;
		obj.view("ȫ�浿");
	}
	static void methodA(String name) {
		System.out.println(name);
	}
}
