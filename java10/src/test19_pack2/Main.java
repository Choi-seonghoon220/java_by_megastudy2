package test19_pack2;

import test19_car.Car;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setModel("�� �� ��");
		car.setColor("���");
		
		car.setColor("�Ķ�");
		System.out.println("�� : " + car.getModel());
		System.out.println("���� : " + car.getColor());
	}

}
