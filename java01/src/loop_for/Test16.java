package loop_for;

public class Test16 {
	
	public static void main(String[] args) {
		int k = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i <=3)
				k = k + 1;
			if (i >= 8)
				k = k + 1;
			k = k + 1;
		}
		
		System.out.println(k);
	}
}