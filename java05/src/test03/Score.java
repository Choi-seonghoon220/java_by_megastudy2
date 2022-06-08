package test03;

public class Score {
	String name;
	int test1, test2, test3;
	int tot;
	double avg;
	
	Score(String name, int test1, int test2, int test3){
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		
		this.tot = test1 + test2 + test3;
		this.avg = this.tot / 3.0;
	}
	
	void view() {
		System.out.printf("%-5s%4d%4d%4d%4d%7.2f\n", this.name, this.test1, this.test2, this.test3, this.tot, this.avg);
	}
	
}
