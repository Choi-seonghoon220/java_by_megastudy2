package loop_for;

public class Test12 {
	
	public static void main(String[] args) {
		int n, k;
		n = 2;
		k = 5;
		for (int i = 1; i <= 5; i++)
			k = k + n;
		System.out.println(k);
	}
}