package test01;

public class Ex1 {

	public static void main(String[] args) {
		Data a, b;

		a = new Data();
		b = new Data();
		
		a.setData("kim", 50);
		b.setData("munn", 30);
		
		a.view();
		b.view();
	}
	

}
