package test32_fileRead_sortByArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		File file = new File("./data_file/num_score");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		
		ArrayList<Score> scoreLst = new ArrayList<>();
		
		while (sc.hasNext()) {
			scoreLst.add(new Score(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();
		
		Comparator<Score> s= new Comp();
		
//		DescendingOrder(scoreLst);
		
        scoreLst.sort( (a, b)-> Double.compare( a.avg,  b.avg)  );  	
        
        view( scoreLst );
		
		
	}
	static ArrayList<Score> DescendingOrder(ArrayList<Score> score){
		ArrayList<Score> result = (ArrayList<Score>) score.clone();
		int length = result.size();
		Score temp;
		
//		for (int i = 0; i < length - 1; i++) {
//			for (int j = i + 1; j< length; j++) {
//				if (result.get(i).avg < result.get(j).avg) {
//					temp = result.get(i);
//					result.set(i, result.get(j));
//					result.set(j, temp);
//				}
//			}
//		}
		
//		Arrays.sort(result.toArray(), (a,b)->b-a);
//		
		return result;
	}
	static void view(ArrayList<Score> score) {
		System.out.println("num  kor   eng   mat   tot   avg");
		System.out.println("---------------------------------");
		
		
		for (Score i : score) {
			System.out.println(i);
		}
	}
}

class Comp implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {
	
//		return (int)(o1.avg - o2.avg);
		return Double.compare( o1.avg,  o2.avg);
	}
	
}
