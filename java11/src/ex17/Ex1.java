package ex17;

import ex15.Human;

public class Ex1 {

	public static void main(String[] args) {
		proce("ȫ�浿", 60, (na, age) -> System.out.println(na + " " + age));
		proce("����", 20, Ex1::sub);
	}
	static void proce(String name, int age, Human hu) {
		hu.view(name, age);
	}
	static void sub(String name, int age) {
		System.out.println(name + " " + age);
	}
}
