package test13;

public class Ex1 {

	public static void main(String[] args) {
		Tv a, b;
		
		a = new Tv("»ï¼º", 10);
		b = new Tv("¿¤Áö", 12);
		
		a.view();
		b.view();
		
		
		a.setChannel(14);;
		
		a.view();
	}

}
