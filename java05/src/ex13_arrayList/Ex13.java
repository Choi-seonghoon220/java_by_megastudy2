package ex13_arrayList;

import java.util.ArrayList;

public class Ex13 {

	public static void main(String[] args) {
		ArrayList<Score> scoreList;
		
		scoreList = new ArrayList<Score>();
		
		scoreList.add(new Score("������", 80));
		scoreList.add(new Score("������", 100));
		scoreList.add(new Score("ȫ�浿", 60));
		
		for (int i = 0; i < scoreList.size(); i++) {
			scoreList.get(i).view();
		}
	}

}
