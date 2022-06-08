package test33;

public class Score {
	String name;
	int kor, eng, mat, tot;
	double avg;
	
	Score(String[] arr){
		this.name = arr[0];
		this.kor = Integer.parseInt(arr[1]);
		this.eng = Integer.valueOf(arr[2]);
		this.mat = Integer.valueOf(arr[3]);
		this.tot = this.kor + this.eng + this.mat;
		this.avg = this.tot / 3.0;
	}
	
	public String toString() {
		return String.format("%4s %5d %5d %5d %5d %7.2f", this.name, this.kor, this.eng, this.mat, this.tot, this.avg);
	}
}
