package _7_2480_주사위세개;

import java.util.Scanner;

public class ThreeDice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] diceString = sc.nextLine().split(" ");
		int[] dice = { Integer.parseInt(diceString[0]),
						Integer.parseInt(diceString[1]),
						Integer.parseInt(diceString[2]) };
		int i = 0;
		int max = dice[0];
		
		if (dice[0] == dice[1] && dice[1] == dice[2]) {
			System.out.println(dice[0] * 1000 + 10000);
		} else if ((dice[0] == dice[1] && i == 0)
				|| (dice[1] == dice[2] && (i += 1) == 1)
				|| (dice[0] == dice[2] && (i += 2) == 2)) {
			System.out.println(dice[i] * 100 + 1000);
		} else {
			for (int j = 1; j < dice.length; j++) {
				max = max < dice[j] ? dice[j] : max;
			}
			System.out.println(max * 100);
		}
		
	}

}
