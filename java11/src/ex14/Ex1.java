package ex14;

public class Ex1 {

	public static void main(String[] args) {
		Human objA = new My();
		//���ٽ� ǥ��
		Human objB = name -> System.out.println(name + "^^");
		Human objC = name -> {
			for (int i = 1; i <= 4; i++) {
				System.out.print(name + " ");
			}
		};
		objA.view("ȫ�浿");
		objB.view("����");
		objC.view("�ּ���");
	}

}
