package _6_2525_¿Àºì½Ã°è;

import java.util.Scanner;

public class AiTimer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour, minute, workingTime;
		String[] currentTimeString = sc.nextLine().split(" ");
		workingTime = Integer.parseInt(sc.nextLine());
		hour = Integer.parseInt(currentTimeString[0]);
		minute = Integer.parseInt(currentTimeString[1]);
		
		getFinishTime(hour, minute, workingTime);
	}
	static void getFinishTime(int hour, int minute, int workingTime) {
		int temp = 0;
		
		minute += workingTime;
		
		if (minute >= 60) {
			hour = hour + minute / 60;
			minute = minute % 60;
		}
		
		if (hour >= 24) {
			hour = hour % 24;
		}
		
		System.out.println(hour + " " + minute);
	}
}
