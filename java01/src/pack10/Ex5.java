package pack10;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st, kind;
		
		System.out.print("�����̸� : ");
		st = sc.next();
		
		kind = "��Ÿ";
		
		if (st.equals("����") || st.equals("ȣ����"))
		{
			kind = "����̰�";
		}
		if (st.equals("������") || st.equals("�ξ���"))
		{
			kind = "������";
		}
		if (st.equals("����") ||  st.equals("����"))
		{
			kind = "����";
		}
		
		System.out.println(kind);
	}

}
