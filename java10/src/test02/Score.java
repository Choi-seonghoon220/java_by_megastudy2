package test02;

public class Score {
	String name;
	int kor, eng, mat;
	
	void setData(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void setKor(int kor) {
		this.kor = kor;
	}
	
	void setEng(int eng) {
		this.eng = eng;
	}
	
	void setMat(int mat) {
		this.mat = mat;
	}
	
	double getAvg() {
		return (this.kor + this.eng + this.mat) / 3.0; 
	}
	
	void view() {
		System.out.printf("�̸� : %s  ���� : %d  ���� : %d ���� : %d ���� : %d\n", this.name, this.kor, this.eng, this.mat,
				(this.kor + this.eng + this.mat));
	}
}
