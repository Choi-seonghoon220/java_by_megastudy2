package ex01;

public class Eagle extends Animal {
	public int weight;
	
	public Eagle(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void fly() {
		System.out.println(this.name + " �������� ���� : " + this.weight);
		System.out.println("����");
	}
}
