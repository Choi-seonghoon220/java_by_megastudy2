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
		System.out.printf("%s가 %d속도로 달린다.\n", this.type, this.speed);
//		System.out.println(this.type);
//		System.out.println(this.speed);
	}
}
