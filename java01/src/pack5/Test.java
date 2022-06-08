package pack5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner sc = new Scanner( System.in );
		 
		 System.out.print("입력:");
		 String line = sc.nextLine();
		 int v;
		 
		 try {
		    v = Integer.parseInt(line);
  		    System.out.println( v+100 );
		 }catch (Exception e) {
		 	System.out.println("수가 아닙니다.");
		}
		 
		 
		 

	}

}
