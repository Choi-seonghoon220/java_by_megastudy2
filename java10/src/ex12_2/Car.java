package ex12_2;

public class Car {
	String type;
	int speed;
	
	Car() {
//		this.type = "Ʈ��";
//		this.speed = 80;
		this("Ʈ��", 80);	//�ٸ� ������ ȣ��
	}
	
	Car(String t) {
//		this.type = t;
//		this.speed = 80;
		this(t, 80);	// �ٸ� ������ ȣ��
	}
	
	Car(String t, int speed) {
		this.type = t;
		this.speed = speed;
	}
	
	void view() {
		System.out.println(this.type + " " + this.speed);
	}
}
