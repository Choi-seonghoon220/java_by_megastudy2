package ex14_1_�͸���Ŭ��������_��ü����;

public class Ex1 {

	public static void main(String[] args) {
		Human obj = new Human() {
			public void view(String st) {
				System.out.println(st);
			}
		};
		obj.view("ȫ�浿");
		
		Animal animal = new Animal() {
			String name;
			public void bark() {
				System.out.println("�۸�");
			}
		};
		
		
		animal.bark();
	}
}

class Animal{
	void bark() {
		System.out.println("");
	}
}