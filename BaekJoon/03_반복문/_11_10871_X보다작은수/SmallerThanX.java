package _11_10871_X보다작은수;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallerThanX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nX, numListString;
		String[] nXStringArr, numListStringArr;
		
		nX = sc.nextLine();
		numListString = sc.nextLine();
		
		nXStringArr = nX.split(" ");
		numListStringArr = numListString.split(" ");

		int[] nXArr;
		nXArr = new int[2];
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		nXArr[0] = Integer.parseInt(nXStringArr[0]);
		nXArr[1] = Integer.parseInt(nXStringArr[1]);
		
		for (int i = 0; i < nXArr[0]; i++) {
			numList.add(Integer.parseInt(numListStringArr[i])); 
		}
		
		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) < nXArr[1]) {
				System.out.print(numList.get(i) + " ");
			}
		}
	}

}
