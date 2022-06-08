package test11;

public class Cal {
	int num1, num2;

	public Cal(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int add() {
		return (this.num1 + this.num2);
	}
	
	int sub() {
		return (this.num1 - this.num2);
	}
	
	int mul() {
		return (this.num1 * this.num2);
	}
	
	int div() {
		return(this.num1 / this.num2);
	}
	
}
