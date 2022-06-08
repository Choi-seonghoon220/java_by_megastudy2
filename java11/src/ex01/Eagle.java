package ex01;

public class Eagle extends Animal {
	public int weight;
	
	public Eagle(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void fly() {
		System.out.println(this.name + " 독수리의 무게 : " + this.weight);
		System.out.println("날다");
	}
}
