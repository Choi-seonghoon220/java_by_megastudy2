package test32_fileRead_sortByArray;

public class Score {
	int num;
	int kor, eng, mat, tot;
	double avg;
	
	public Score(int num, int kor, int eng, int mat) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = this.kor + this.eng + this.mat;
		this.avg = this.tot / 3.0;
	}
	
	public String toString() {
		return String.format("%2d %5d %5d %5d %5d %7.2f", this.num, this.kor, this.eng, this.mat, this.tot, this.avg);
	}
}
