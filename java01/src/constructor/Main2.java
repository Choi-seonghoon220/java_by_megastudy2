package constructor;

public class Main2 {

	public static void main(String[] args) {
		Score score;
		
//		score = Main3.getData(name, sc)
//		Score score = new Score("�迵��", 50);
//		
//		sub(score);
//		
//		score.print();
	}
	static void sub(Score obj) {
		obj.name = obj.name + "^^";
		obj.score += 10;
	}
}
