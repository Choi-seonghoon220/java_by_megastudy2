package ex07;

public class Dog extends Object {
	String kind, name;
	
	Dog(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	public String toString() {
		return this.kind + " " + this.name;
	}
}
