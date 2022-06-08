package ex13_arrayList;

public class Score {
	String name;
	int score;
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void view() {
		System.out.println(this.name + " " + this.score);
	}
	
}
