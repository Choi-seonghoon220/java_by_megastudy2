package test01;

public class Data {
	String name;
	int score;
//	Data (String name, int score){
//		this.name = name;
//		this.score = score;
//	}
	
	void setData (String name, int score){
		this.name = name;
		this.score = score;
	}
	
	
	void view() {
		System.out.printf("%5s%10d\n", this.name, this.score);
	}
}
