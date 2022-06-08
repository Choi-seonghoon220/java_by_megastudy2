package ex08;

public class BarTest {

	public static void main(String[] args) {
		Bar bar1 = new Bar();
		Bar bar2 = new Bar();
		
		bar1.setShape("¤±");
		bar2.setShape("¤·");
		
		bar1.draw(5);
		bar1.draw(10);
		bar2.draw(7);
		bar2.draw(15);
	}

}
