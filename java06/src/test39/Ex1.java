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
			System.out.print("�̸� : ");
			temp = sc.nextLine();
			
			if (temp.equals(""))
				break;
			
			arr = data.find(temp);
			
			if (arr != null) {
				System.out.println("���� : " + arr[1]);
				System.out.println("���� : " + arr[2]);
				System.out.println("��ȭ : " + arr[3]);
			} else
				System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}
	}
}
