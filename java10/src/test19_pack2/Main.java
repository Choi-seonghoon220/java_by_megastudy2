package test19_pack2;

import test19_car.Car;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setModel("¾Æ ¹Ý Å×");
		car.setColor("Èò»ö");
		
		car.setColor("ÆÄ¶û");
		System.out.println("¸ðµ¨ : " + car.getModel());
		System.out.println("»ö»ó : " + car.getColor());
	}

}
