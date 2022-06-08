package ex06;

public class Shape {
	// 필드
	int width, height;
	// 메소드
	void setWidth(int w) { this.width = w; }
	void setHeight(int h) { this.height = h; }
	int getArea() {
		return this.width * this.height;
	}
}
