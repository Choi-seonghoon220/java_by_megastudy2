package constructor;

public class Score {
	String name;
	int score;
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void print() {
		System.out.printf("�̸� : %s, ���� : %d��\n", this.name, this.score);
	}
	
}
