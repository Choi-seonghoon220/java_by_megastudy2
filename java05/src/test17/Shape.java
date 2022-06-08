package test17;

public class Shape {
	String sign;
	
	Shape(String sign){
		this.sign = sign;
	}
	
	void draw(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(this.sign);
		}
		System.out.println();
	}
}
