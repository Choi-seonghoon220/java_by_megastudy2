package ex08;

public class StudentB {
	int ban, num;
	
	StudentB(int ban, int num) {
		this.ban = ban;
		this.num = num;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof StudentB) {
			StudentB stu = (StudentB) obj;
			return this.ban == stu.ban && this.num == stu.num;
		}
		return false;
	}
}
