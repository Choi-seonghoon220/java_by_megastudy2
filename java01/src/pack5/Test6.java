package pack5;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			String day, st;
			
			System.out.println( "날짜를 입력하세요.");
			day = sc.next();
			
			if (day.equals("sun")) {
				st = "일요일";
			} else if (day.equals("mon")) {
				st = "월요일";
			} else if (day.equals("tue")) {
				st = "화요일";
			} else if (day.equals("wed")) {
				st = "수요일";
			} else if (day.equals("thu")) {
				st = "목요일";
			} else if (day.equals("fri")) {
				st = "금요일";
			} else if (day.equals("sat")) {
				st = "토요일";
			} else {
				st = "에러";
			}
			System.out.println(st);
	}

}
