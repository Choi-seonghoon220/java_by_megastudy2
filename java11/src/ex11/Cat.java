package ex11;

public class Cat extends Animal implements Behavior{
	public String havit;
	
	public Cat(String name, int age, String havit) {
		super(name, age);
		this.havit = havit;
	}
	String getHavit() {
		return this.havit;
	}
	//Behavior 구현
	public void sleep() {
		System.out.println("고양이가 잠자다");
	}
	public void bark() {
		System.out.println("야옹");
	}
	public void view() {
		System.out.println("Cat Info~~~");
		System.out.printf("name : %s age : %d havit : %s\n", this.name, this.age, this.havit); 
	}
}
