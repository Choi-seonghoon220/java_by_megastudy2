package ex08;

public class Bar {
	String shape;
	
	public void setShape(String sh) {
		this.shape = sh;
	}
	void draw(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.print(this.shape);
		}
		System.out.println();
	}
}
