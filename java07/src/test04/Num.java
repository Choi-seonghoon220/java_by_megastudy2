package test04;

public class Num {
	static double fact(int n) {
		double result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
}
