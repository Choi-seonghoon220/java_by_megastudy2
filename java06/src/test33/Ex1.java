package test33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		ArrayList<Score> score = new ArrayList<>();
		
		File file = new File("./data_file/name_score");
		
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		
		while(sc.hasNext()) {
			score.add(new Score(sc.nextLine().split(",")));
		}
		sc.close();
		
		ArrayList<Score> sortedScore = ascendingOrder(score);
		
		view(sortedScore);
	}
	static ArrayList<Score> ascendingOrder(ArrayList<Score> score){
		ArrayList<Score> result = (ArrayList<Score>)score.clone();;
		int length = score.size();
		String stringTemp;
		int temp;
		double doubleTemp;
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = 1; j < length; j++) {
				if (result.get(j - 1).name.compareTo(result.get(j).name) > 0) {
					stringTemp = result.get(j-1).name;
					result.get(j-1).name = result.get(j).name;
					result.get(j).name = stringTemp;
					
					temp = result.get(j-1).kor;
					result.get(j-1).kor = result.get(j).kor;
					result.get(j).kor = temp;
					
					temp = result.get(j-1).eng;
					result.get(j-1).eng = result.get(j).eng;
					result.get(j).eng = temp;
					
					temp = result.get(j-1).mat;
					result.get(j-1).mat = result.get(j).mat;
					result.get(j).mat = temp;

					temp = result.get(j-1).tot;
					result.get(j-1).tot = result.get(j).tot;
					result.get(j).tot = temp;
					
					doubleTemp = result.get(j-1).avg;
					result.get(j-1).avg = result.get(j).avg;
					result.get(j).avg = doubleTemp;
					
				}
			}
		}
		return result;
	}
	static void view(ArrayList<Score> score) {
		System.out.println(" name   kor   eng   mat   tot   avg");
		System.out.println("------------------------------------");
		
		for (Score s : score) {
			System.out.println(s);
		}
	}
}
