package pack10;

public class Ex3 {

	public static void main(String[] args) {
		String name, addr, st;
		name = "ȫ�浿";
		addr = "���� ���α�";
		
		if (addr.startsWith("����"))
			st = name + "���� ���￡�� ��ó׿�.";
		else if (addr.startsWith("�λ�"))
			st = name + "���� �λ꿡�� ��ó׿�.";
		else
			st = name + "�� ��� ��ó���?";
		
		System.out.println(st);
	}

}
