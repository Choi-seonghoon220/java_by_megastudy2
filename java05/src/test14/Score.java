package test14;

public class Score {
	String name;
	int score;
	
	public Score(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	void view() {
		System.out.printf("%-5s%d\n", this.name, this.score);
	}
}
