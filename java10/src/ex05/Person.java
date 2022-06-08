package ex05;

public class Person {
	String name;
	int age;
	
	void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void view() {
		System.out.println(this.name + " " + this.age);
	}
}
