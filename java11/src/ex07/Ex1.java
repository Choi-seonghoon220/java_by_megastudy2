package ex07;

public class Ex1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "ȫ�浿";
		
		Dog dog = new Dog("��Ƽ��", "����");
		
		System.out.println(p.toString());
		
		System.out.println(dog.toString());
		
		String str = "Dog ��ü" + dog;
		System.out.println(str);
	
		view(p);
		view(dog);
	}
	static void view(Object obj) {
		System.out.println(obj);
	}
	
}
