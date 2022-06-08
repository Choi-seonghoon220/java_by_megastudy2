package test26;

public class Score {
	static int count = 100;
	int num, testScore;
	String name;
	int rank;
	
	Score(String name, int testScore) {
		this.num = count;
		this.name = name;
		this.testScore = testScore;
		
		count = count + 100;
	}
	
	public int Rank(Score[] arr){
		int r = 1;
		
		for (Score temp : arr) {
			if (this.testScore < temp.testScore) {
				r++;
			}
		}
		
		return r;
	}
	
	public String toString() {
		return this.num + "    " + this.testScore;
	}
}
