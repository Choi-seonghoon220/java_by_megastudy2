package ex23;

public class Person {
	private String name = "ȫ�浿";
	
	private String info() {
		return "�̸� = " + this.name;
	}
	public void view() {
		//Ŭ���� ��������� ��������
		System.out.println(this.info());
	}
}
