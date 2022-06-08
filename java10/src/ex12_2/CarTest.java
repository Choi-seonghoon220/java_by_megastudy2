package ex12_2;

public class CarTest {

	public static void main(String[] args) {
		Car car1, car2, car3;
		car1 = new Car();
		car2 = new Car("버스");
		car3 = new Car("택시", 120);
		
		car1.view();
		car2.view();
		car3.view();
	}
}
