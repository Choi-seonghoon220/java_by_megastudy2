package ex21_ex13;

public class Ex1 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40, 50 },
						{ 60, 70, 80, 90, 95 },
						{ 85, 75, 65, 55, 45 },
						{ 35, 25, 15, 5, 70 }
		};
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
