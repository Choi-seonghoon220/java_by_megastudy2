package ex16;

import ex15.Human;

public class Ex1 {

	public static void main(String[] args) {
		Human obj = Ex1::proce;
		
		obj.view("ȫ�浿", 60);
	}
	static void proce(String name, int age) {
		System.out.println(name + " " + age);
	}
}
