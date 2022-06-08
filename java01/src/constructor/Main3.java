package constructor;

public class Main3 {

	public static void main(String[] args) {
		Main3 obj = new Main3();
		
		Score score = obj.getData("È«±æµ¿", 50);
		
//		score = getData("±è¿µ¹Ì", 90);
		score.print();
	}
	 Score getData(String name, int sc) {
		Score s = new Score(name, sc);
		return s;
	}
}
