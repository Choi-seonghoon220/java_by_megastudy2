package test40_2DimensionalArray;

public class ArrayEx {
	int[][] arr;

	public ArrayEx(int[][] arr) {
		this.arr = arr;
	}
	
	public void view(int type) {
		int row, column;
		row = this.arr.length;
		column = this.arr[0].length;
		
		int[][] result = null;
		
		if (type == 1) {
			result = new int[column][row];
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					result[j][i] = this.arr[i][j];
				}
			}
			
		} else if (type == 2) {
			result = new int[row][column];
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					result[row - i - 1][column - j - 1] = this.arr[i][j];
				}
			}
		} else if (type == 3) {
			result = new int[column][row];
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					result[column - j - 1][row - i - 1] = this.arr[i][j];
				}
			}
		}
		
		System.out.println("출력 결과 " + type);
		for (int[] ar : result) {
			for (int v : ar) {
				System.out.printf("%-4d", v);
			}
			System.out.println();
		}
	}
}
