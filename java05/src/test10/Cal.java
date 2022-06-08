package test10;

public class Cal {
	int num, tot;

	public Cal(int num) {
		this.num = num;
		this.tot = num;
	}
	
	void add(int num) {
		this.tot = this.tot + num;
	}
	
	void sub(int num) {
		this.tot = this.tot - num;
	}
	
	int result() {
		return this.tot;
	}
	
	
}
