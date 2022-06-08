package test39;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		Data data = null;
				
		try{
			data = new Data("gogak.txt");
		} catch (FileNotFoundException err) {
			System.out.println("File not found");
			System.exit(0);
		}
		
		String[] arr;
		Scanner sc = new Scanner(System.in);
		String temp;
		
		while (true) {
			System.out.print("이름 : ");
			temp = sc.nextLine();
			
			if (temp.equals(""))
				break;
			
			arr = data.find(temp);
			
			if (arr != null) {
				System.out.println("성별 : " + arr[1]);
				System.out.println("나이 : " + arr[2]);
				System.out.println("전화 : " + arr[3]);
			} else
				System.out.println("자료가 존재하지 않습니다.");
		}
	}
}
