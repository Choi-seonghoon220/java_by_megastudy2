package lobyPhone;

import java.util.Scanner;

public class ShowToIrang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int houseHold;
		String houseHoldPw;
		String callType;
		
		System.out.printf("[����, ����ȣ��, ���]\n�Է��ϼ���.\n");
		callType = sc.nextLine();
		
		if (callType.equals("����")) {
			System.out.println("������ ȣ���ϰڽ��ϴ�.");
		}
		else if (callType.equals("����ȣ��")) {
			System.out.print("���� : ");
			houseHold = sc.nextInt();
			System.out.printf("%dȣ�� ȣ���մϴ�.", houseHold);
		}
		else if (callType.equals("���")) {
			System.out.print("���� : ");
			houseHold = sc.nextInt();
			if (houseHold == 402) {
				System.out.print("��й�ȣ : ");
				houseHoldPw = sc.next();
				if (houseHoldPw.equals("0523")) {
					System.out.println("���� ���Ƚ��ϴ�.");
				}
				else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}
		}
		else {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		}
	}

}
