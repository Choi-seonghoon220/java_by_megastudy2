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
	//Behavior ����
	public void sleep() {
		System.out.println("����̰� ���ڴ�");
	}
	public void bark() {
		System.out.println("�߿�");
	}
	public void view() {
		System.out.println("Cat Info~~~");
		System.out.printf("name : %s age : %d havit : %s\n", this.name, this.age, this.havit); 
	}
}
