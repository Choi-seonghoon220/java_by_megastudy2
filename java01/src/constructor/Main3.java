package constructor;

public class Main3 {

	public static void main(String[] args) {
		Main3 obj = new Main3();
		
		Score score = obj.getData("ȫ�浿", 50);
		
//		score = getData("�迵��", 90);
		score.print();
	}
	 Score getData(String name, int sc) {
		Score s = new Score(name, sc);
		return s;
	}
}
