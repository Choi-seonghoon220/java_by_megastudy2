package ex11;

public class Wolf extends AnimalAdapter {
	public Wolf(String name, int age) {
		super(name, age);
	}
	@Override
	public void bark() {
		System.out.println("�ƿ�~~~");
	}
	@Override
	public void view() {
		System.out.println("���� ����");
		System.out.printf("�̸� : %s ���� : %d\n", this.name, this.age);
	}
}
