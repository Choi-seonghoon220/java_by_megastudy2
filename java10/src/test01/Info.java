package test01;

public class Info {
	String name;
	int age;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void view() {
		System.out.printf("이름 : %s, 나이 : %d", this.name, this.age);
	}
}
