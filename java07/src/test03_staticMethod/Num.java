package test03_staticMethod;

public class Num {

	static int max(int a, int b, int c) {
		int result = a;
		
		if (b > result) {
			result = b;
		}
		if (c > result) {
			result = c;
		}
		return result;
	}
	
	static int min(int a, int b, int c) {
		int result = a;
		
		if (b < result) {
			result = b;
		}
		if (c < result) {
			result = c;
		}
		return result;
	}
}
