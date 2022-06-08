package ex12_2;

public class Car {
	String type;
	int speed;
	
	Car() {
//		this.type = "트럭";
//		this.speed = 80;
		this("트럭", 80);	//다른 생성자 호출
	}
	
	Car(String t) {
//		this.type = t;
//		this.speed = 80;
		this(t, 80);	// 다른 생성자 호출
	}
	
	Car(String t, int speed) {
		this.type = t;
		this.speed = speed;
	}
	
	void view() {
		System.out.println(this.type + " " + this.speed);
	}
}
