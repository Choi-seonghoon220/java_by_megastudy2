package test18;

public class Ex1 {

	public static void main(String[] args) {
		Person a, b;
		
		a = new Person("홍   길동", 60);
		b = new Person("이  건   길", 40);
		
		a.view();
		b.view();
		
		a.setName("강  호  동");
		a.setAge(200);
		b.setAge(-20);
		
		a.view();
		b.view();
	}

}
