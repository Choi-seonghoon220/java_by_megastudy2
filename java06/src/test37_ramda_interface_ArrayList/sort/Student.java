package test37_ramda_interface_ArrayList.sort;

public class Student {
	int ban, num, kor, eng, mat;
	String name;
	int tot;
	double avg;
	
	public Student(int ban, int num, String name, int kor, int eng, int mat) {
		this.ban = ban;
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.tot = kor + eng + mat;
		this.avg = this.tot / 3.0;
	}
	
	public String toString() {
		return String.format("%6d %6s %10d %6d %6d %6d %6.2f", this.num, this.name, this.kor, this.eng, this.mat, this.tot, this.avg);
	}

}
