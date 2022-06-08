package package_class_ex2;

public class Person extends Object {
	static String caption_str = "-";
	String name;
	int age;
	
	void setValue(String name, int age) {
		this.name = name;
		this.age = age;
	}
	static void printTitle(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.print(caption_str);
		}
		System.out.println();
	}
	void viewName() {
		System.out.println("이름 : " + this.name);
	}
	void viewAge() {
		System.out.println("나이 : " + this.age);
	}
	void print() {
		this.viewName();
		this.viewAge();
	}

}
