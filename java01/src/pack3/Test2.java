package pack3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("data1.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("'data1.txt' file not found");
			System.exit(0);
		}
		
		String temp, st;
		String[] arr;
		int kor, eng, mat, tot;
		double avg;
		
		while (sc.hasNext()) {
			temp = sc.nextLine();
			arr = temp.split(",");
			
			kor = Integer.parseInt(arr[1]);
			eng = Integer.parseInt(arr[2]);
			mat = Integer.parseInt(arr[3]);
			
			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			st = String.format("%5s %4d %4d %4d %4d %7.2f",  arr[0], kor, eng, mat, tot, avg);
			System.out.println(st);
		}
		sc.close();

	}

}
