package test15;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car("아반테");
		Car c2 = new Car("그랜져", "검정", 2019);
		Car c3 = new Car("싼타페", "흰색");
		
		c1.view();
		c2.view();
		c3.view();
	}

}
