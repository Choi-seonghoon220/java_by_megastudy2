package ex15;

public class Ex1 {

	public static void main(String[] args) {
		//���ٽ� ǥ��
		Human objA = (name, age) -> System.out.println(name + " " + age);
		Human objB = (name, age) -> System.out.println(name + "~~~" + age);
		
		objA.view("ȫ�浿", 60);
		objB.view("����", 23);
	}

}
