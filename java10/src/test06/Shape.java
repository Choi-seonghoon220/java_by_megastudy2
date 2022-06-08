package test06;

public class Shape {
	String type;
	
	public Shape(String type) {
		this.type = type;
	}
	
	void draw(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(this.type);
		}
		System.out.println();
	}
}
