package lobyPhone;

import java.util.Scanner;

public class UpgradeVersion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int houseHold;
		String houseHoldPw;
		String callType, houseHoldType;

		System.out.println("세대호수를 입력하거나 경비실을 호출하세요");
		callType = sc.next();
		
		if (callType.matches("^[0-9]*$")) {
			System.out.println("[호출, 비번]");
			houseHoldType = sc.next();
			
			if (houseHoldType.equals("호출")) {
				System.out.printf("%s호를 호출합니다.", callType);
			}
			else if (houseHoldType.equals("비번")) {
				System.out.print("비번 : ");
				houseHoldPw = sc.next();
				
				if (houseHoldPw.equals("0523")) {
					System.out.println("문이 열렸습니다.");
				}
				else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
		}
		else if (callType.equals("경비실")) {
			System.out.println("경비실을 호출합니다.");
		}
	}

}
