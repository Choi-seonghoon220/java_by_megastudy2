package constructor;

public class Score {
	String name;
	int score;
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void print() {
		System.out.printf("이름 : %s, 점수 : %d점\n", this.name, this.score);
	}
	
}
