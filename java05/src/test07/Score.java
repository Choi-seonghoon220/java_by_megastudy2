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
			System.out.printf("%s씨는 합격입니다.\n", this.name);
		else
			System.out.printf("%s씨는 불합격입니다.\n", this.name);
	}
}
