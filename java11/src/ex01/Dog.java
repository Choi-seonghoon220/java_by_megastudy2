package ex01;

public class Dog extends Animal {
	String kind;
	
	public Dog(String name, String kind) {
		this.name = name;
		this.kind = kind;
	}
	
	public void bark() {
		System.out.println(this.name + " 강아지 종류 : " + this.kind);
		System.out.println("짖다");
	}
}
