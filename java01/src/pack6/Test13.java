package pack6;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		String season;
		
		month = Integer.parseInt(sc.nextLine());
		
		season="";
		
		if (month >= 3 && month <= 5) 
			  season = "��";
		if (month >= 6 && month <= 8) 
			  season = "����";
		if (month >= 9 && month <= 11) 
			  season = "����";
		if (month == 12 || month >= 1 && month <= 2) 
			  season = "�ܿ�";
		
		System.out.println(season);
	}

}
