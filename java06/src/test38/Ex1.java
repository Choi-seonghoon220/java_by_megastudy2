package test38;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Ex1 {

	public static void main(String[] args) {
		Data data = null;
				
		try{
			data = new Data("gogak.txt");
		} catch (FileNotFoundException err) {
			System.out.println("File not found");
			System.exit(0);
		}
		
		ArrayList<String[]> maleList = data.getData("남");
		ArrayList<String[]> femaleList = data.getData("여");

		view("남자", maleList);
		view("여자", femaleList);
	}
	static void view(String sex, ArrayList<String[]> list) {
		System.out.println(sex);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%5s %5s %15s\n", list.get(i)[0], list.get(i)[2], list.get(i)[3]);
		}
	}
}
