package test05;

public class Score {
	String name;
	int test1, test2, test3;
	
	Score(String name, int test1, int test2, int test3){
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	
	void view() {
		System.out.printf("%-5s%4d%4d%4d\n", this.name, this.test1, this.test2, this.test3);
	}
	
	int getTot() {
		return this.test1 + this.test2 + this.test3;
	}
}
