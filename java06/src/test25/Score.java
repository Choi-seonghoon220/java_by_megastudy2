package test25;

public class Score {
	int num, testScore;
	
	Score(int num, int testScore){
		this.num = num;
		this.testScore = testScore;
	}
	
	public String toString() {
		return this.num + "    " + this.testScore;
	}
}
