package test24;

public class Score {
	int num, testScore;
	String name;
	
	public Score(int num, String name, int testScore) {
		this.num = num;
		this.name = name;
		this.testScore = testScore;
	}
	
	public String toString() {
		return "이름 : " + this.name + ", 점수 : " + this.testScore;
	}

}
