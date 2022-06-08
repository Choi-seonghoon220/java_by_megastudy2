package test15;

public class Car {
	String name, color;
	int year;
	
	public Car(String name) {
		this(name, "Èò»ö", 2020);
	}
	public Car(String name, String color) {
		this(name, color, 2020);
	}
	public Car(String name, String color, int year) {
		this.name = name;
		this.color = color;
		this.year = year;
	}
	
	void view() {
		System.out.printf("%-4s %-3s %d³â½Ä\n", this.name, this.color, this.year);
	}
}
