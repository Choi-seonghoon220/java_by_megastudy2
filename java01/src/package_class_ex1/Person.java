package package_class_ex1;

public class Person {
	static int max_age = 120;
	String name;
	int age;
	
	static void view_bar() {
		System.out.println("-------------------");
	}
	
	void view() {
		System.out.println(this.name + " " + this.age);
	}
}