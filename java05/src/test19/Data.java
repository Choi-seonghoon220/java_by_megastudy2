package test19;

public class Data {
	static String nameCaption="Name", ageCaption="Age";
	
	String name;
	int age;
	
	Data(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void view() {
		System.out.printf("%s : %s %s : %d\n", this.nameCaption, this.name, ageCaption, this.age);
	}
}
