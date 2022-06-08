package test22;

import java.util.ArrayList;

public class Student {
	ArrayList<Integer> numList = new ArrayList<>();
	ArrayList<Integer> scoreList = new ArrayList<>();
	ArrayList<String> nameList = new ArrayList<>();
	
	Student(int[] numArr, String[] nameArr, int[] scoreArr) {
		for (int i = 0; i < numArr.length; i++) {
			numList.add(numArr[i]);
			nameList.add(nameArr[i]);
			scoreList.add(scoreArr[i]);
		}
	}
	
}
