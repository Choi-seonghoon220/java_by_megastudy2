package ex11;

public class Dog implements Behavior {
	public String kind;
	public Dog(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return this.kind;
	}
	// Behavior ±¸Çö
	public void sleep() {
		System.out.println("°³°¡ ÀáÀÚ´Ù");
	}
	public void bark() {
		System.out.println("¸Û¸Û");
	}
	public void view() {
		System.out.println("Dog Info~~~");
		System.out.println(this.kind);
	}
}
