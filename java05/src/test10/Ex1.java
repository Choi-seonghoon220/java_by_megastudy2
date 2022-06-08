package test10;

public class Ex1 {

	public static void main(String[] args) {
		Cal a;
		
		a = new Cal(5);
		
		a.add(4);
		a.add(10);
		
		a.sub(2);
		
		System.out.printf("°á°ú  = %d\n", a.result());
	}

}
