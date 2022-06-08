package test12;

public class Number {
	int num1, num2, num3, num4;

	public Number(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	int getMax() {
		int max = this.num1;
		if (max < this.num2) max = this.num2;
		if (max < this.num3) max = this.num3;
		if (max < this.num4) max = this.num4;

		return max;
	}
	
	int getMin() {
		int min = this.num1;
		if (min > this.num2) min = this.num2;
		if (min > this.num3) min = this.num3;
		if (min > this.num4) min = this.num4;
		
		return min;
	}
	int getSum() {
		return this.num1 + this.num2 + this.num3 + this.num4;
	}
	double getAvg() {
		double avg;
		
		avg = this.getSum() / 4.0; 
		
		return avg;
	}
	
	
}
