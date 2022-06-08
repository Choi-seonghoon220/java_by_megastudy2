package ex13_arrayList;

import java.util.ArrayList;

public class Ex13 {

	public static void main(String[] args) {
		ArrayList<Score> scoreList;
		
		scoreList = new ArrayList<Score>();
		
		scoreList.add(new Score("¼ÕÁ¤¿ì", 80));
		scoreList.add(new Score("±èÇü¼®", 100));
		scoreList.add(new Score("È«±æµ¿", 60));
		
		for (int i = 0; i < scoreList.size(); i++) {
			scoreList.get(i).view();
		}
	}

}
