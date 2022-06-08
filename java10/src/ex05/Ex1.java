package ex05;

public class Ex1 {

	public static void main(String[] args) {
		Person a;
		Square b;
		
		a = new Person();
		b = new Square();
		
		a.setData("ȫ�浿",  60);
		b.setData(50,  60);
		
		a.view();
		b.view();
	}
}
