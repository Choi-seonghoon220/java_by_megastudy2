package ex01;

public class Dog extends Animal {
	String kind;
	
	public Dog(String name, String kind) {
		this.name = name;
		this.kind = kind;
	}
	
	public void bark() {
		System.out.println(this.name + " ������ ���� : " + this.kind);
		System.out.println("¢��");
	}
}
