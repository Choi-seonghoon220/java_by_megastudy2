package test43;

public class MagicSquare {
	
	
	public void view(int num) {
		int[][] arr = new int[num][num];
		
//		int max = (num * num + 1) * num / 2;
		int mid = (num - 1) / 2;
		
		int row, column;
		row = 0;
		column = mid;
		
		
		for (int i = 1; i <= num * num; i++) {
			arr[row][column] = i;
			
			if ( i % num == 0) {
				row = row + 1;
				continue;
			}
			row--;
			column++;
			if (row<0 ) {
				row = num - 1;
			}
			if (column>=num) {
				column = 0;
			}
			
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		for (int[] ar : arr) {
//			for (int v : ar) {
//				System.out.print(v + " ");
//			}
//			System.out.println();
//		}
	}

}
