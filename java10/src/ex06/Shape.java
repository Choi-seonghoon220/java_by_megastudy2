package ex06;

public class Shape {
	// �ʵ�
	int width, height;
	// �޼ҵ�
	void setWidth(int w) { this.width = w; }
	void setHeight(int h) { this.height = h; }
	int getArea() {
		return this.width * this.height;
	}
}
