package test23_toString;

public class Score {
	int num, testScore;
	String name;
	
	public Score(int num, String name, int testScore) {
		this.num = num;
		this.name = name;
		this.testScore = testScore;
	}

	Score() {

	}
    
	public String toString() {
		
		return this.num+" "+this.name+" "+this.testScore;
	}

}
