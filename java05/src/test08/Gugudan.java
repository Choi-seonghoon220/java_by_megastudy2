package test08;

public class Gugudan {
	int num;
	
	Gugudan(int num){
		this.num = num;
	}
	
	void view() {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", this.num, i, (this.num * i));
		}
	}
}
