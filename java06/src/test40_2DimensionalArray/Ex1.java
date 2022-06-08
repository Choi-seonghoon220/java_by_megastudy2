package test40_2DimensionalArray;

public class Ex1 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40, 50 },
						{ 60, 70, 80, 90, 95 },
						{ 85, 75, 65, 55, 45 },
						{ 35, 25, 15, 5, 70 }
		};
		
		ArrayEx obj = new ArrayEx(arr);
		
		obj.view(1);
		obj.view(2);
		obj.view(3);
	}

}
