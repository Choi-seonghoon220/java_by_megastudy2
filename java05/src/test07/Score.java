package test07;

public class Score {
	String name;
	int score;
	
	Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void test() {
		if (this.score >= 90)
			System.out.printf("%s���� �հ��Դϴ�.\n", this.name);
		else
			System.out.printf("%s���� ���հ��Դϴ�.\n", this.name);
	}
}
