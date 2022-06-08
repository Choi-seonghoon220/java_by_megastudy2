package test20_pack1;

public class Person {
	public String name;
	public int age;
	
	public void setName(String strangeName) {
		this.name = strangeName.replace(" ", "");
	}
	
	public void setAge(int strangeAge) {
		if (strangeAge >= 0) {
			this.age = strangeAge;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
