package test05;

public class Info {
	String name;
	int age;
	static int count;
	
	public Info(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void view() {
		if (count == 0) {
			System.out.println("이름 나이");
			System.out.println("-------");
			count++;
		}
		System.out.println(this.name + " " + this.age);
	}
}
