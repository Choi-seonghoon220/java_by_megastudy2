package test16;

public class Car {
	String type;
	int speed;
	
	Car(String type, int speed){
		this.type = type;
		this.speed = speed;
	}
	
	void speedUp(int newSpeed) {
		this.speed = this.speed + newSpeed;
	}
	
	void speedDonw(int newSpeed) {
		this.speed = this.speed - newSpeed;
	}
	
	void run() {
		System.out.printf("%s�� %d�ӵ��� �޸���.\n", this.type, this.speed);
//		System.out.println(this.type);
//		System.out.println(this.speed);
	}
}
