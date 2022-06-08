package ex05;

public class Square {
	int width, height;
	
	void setData(int width, int height) {
		this.width = width;
		this.height = height;
	}
	void view() {
		int area = this.width * this.height;
		System.out.println("≥–¿Ã = " + area);
	}
}
