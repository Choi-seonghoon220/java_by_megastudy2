package lobyPhone;

import java.util.Scanner;

public class ShowToIrang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int houseHold;
		String houseHoldPw;
		String callType;
		
		System.out.printf("[경비실, 세대호출, 비번]\n입력하세요.\n");
		callType = sc.nextLine();
		
		if (callType.equals("경비실")) {
			System.out.println("경비실을 호출하겠습니다.");
		}
		else if (callType.equals("세대호출")) {
			System.out.print("세대 : ");
			houseHold = sc.nextInt();
			System.out.printf("%d호를 호출합니다.", houseHold);
		}
		else if (callType.equals("비번")) {
			System.out.print("세대 : ");
			houseHold = sc.nextInt();
			if (houseHold == 402) {
				System.out.print("비밀번호 : ");
				houseHoldPw = sc.next();
				if (houseHoldPw.equals("0523")) {
					System.out.println("문이 열렸습니다.");
				}
				else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
		}
		else {
			System.out.println("입력이 잘못되었습니다.");
		}
	}

}
