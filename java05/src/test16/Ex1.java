package test16;

public class Ex1 {

	public static void main(String[] args) {
		Car a, b;
		
		a = new Car("�׷���", 100);
		b = new Car("���׽ý�", 150);
		
		a.speedUp(50);
		b.speedDonw(50);
		
		a.run();
		b.run();
	}
}
