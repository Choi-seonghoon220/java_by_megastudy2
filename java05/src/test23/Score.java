package test23;

public class Score {
	String name;
	int kor, eng, mat;
	
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int getTot(){
		return this.kor + this.eng + this.mat;
	}
	
	int getAvg(){
		return (this.kor + this.eng + this.mat) / 3;
	}
	
	void view() {
		System.out.printf("%-5s%4d%4d%4d%5d%4d\n", 
				this.name, this.kor, this.eng, this.mat, this.getTot(), this.getAvg() );
	}
}
