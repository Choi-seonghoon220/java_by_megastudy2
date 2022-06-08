package ex19_fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

//         new File("./data_file/data.txt");   
//         //.이 현재 폴더
//         //..이 부모 폴더
		
		File file = new File("./data_file/data.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		
		String na;
		int kor, eng, mat, tot;
		
		while (sc.hasNext()) {
			na = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			
			System.out.printf("%4s %4d %4d %4d %4d\n", na, kor, eng, mat, tot);
		}
		sc.close();
	}

}
