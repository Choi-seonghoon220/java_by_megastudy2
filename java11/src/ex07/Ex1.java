package ex07;

public class Ex1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "홍길동";
		
		Dog dog = new Dog("말티즈", "쫑이");
		
		System.out.println(p.toString());
		
		System.out.println(dog.toString());
		
		String str = "Dog 개체" + dog;
		System.out.println(str);
	
		view(p);
		view(dog);
	}
	static void view(Object obj) {
		System.out.println(obj);
	}
	
}
