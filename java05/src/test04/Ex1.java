package test04;

public class Ex1 {

	public static void main(String[] args) {
		Car a, b;
		
		a = new Car("그랜져", 100);
		b = new Car("제네시스", 200);
		
		a.run();
		b.run();
	}

}
