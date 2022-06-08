package pack3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
	 public static void main( String[] args) {
		   Scanner sc = null;

	       try {
	    	   sc = new Scanner(new File("data.txt"));
	       } catch (FileNotFoundException e) {
	           System.out.println("'data.txt' file not found");
	           System.exit(0);
	       }

	       String name, st;
	       int kor, eng, mat, tot;
	       double avg;

	       while (sc.hasNext()) {
	           name = sc.next();
	           kor = sc.nextInt();
	           eng = sc.nextInt();
	           mat = sc.nextInt();

	           tot = kor + eng + mat;
	           avg = tot / 3.0;

	           st = String.format("%5s %4d %4d %4d %4d %7.5f", name, kor, eng, mat, tot, avg);
	           System.out.println(st);
	       }
	       sc.close();

	 }
}
