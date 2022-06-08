package test31_explainComparator;

public class Score {
	String name;
	int score;
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return this.name + "     " + this.score;
	}

	
}
