package ex13;

public class Dog {
	String strType;
	public Dog(String type) {
		this.strType = type;
	}
	void bark() {
		System.out.println(this.strType + " �۸�");
	}
	void sleep() {
		System.out.println(this.strType + " ����");
	}
	void status() {
		this.bark();
		this.sleep();
	}
}
