package lobyPhone;

import java.util.Scanner;

public class UpgradeVersion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int houseHold;
		String houseHoldPw;
		String callType, houseHoldType;

		System.out.println("����ȣ���� �Է��ϰų� ������ ȣ���ϼ���");
		callType = sc.next();
		
		if (callType.matches("^[0-9]*$")) {
			System.out.println("[ȣ��, ���]");
			houseHoldType = sc.next();
			
			if (houseHoldType.equals("ȣ��")) {
				System.out.printf("%sȣ�� ȣ���մϴ�.", callType);
			}
			else if (houseHoldType.equals("���")) {
				System.out.print("��� : ");
				houseHoldPw = sc.next();
				
				if (houseHoldPw.equals("0523")) {
					System.out.println("���� ���Ƚ��ϴ�.");
				}
				else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}
		}
		else if (callType.equals("����")) {
			System.out.println("������ ȣ���մϴ�.");
		}
	}

}
