package test18;

public class Ex1 {

	public static void main(String[] args) {
		Person a, b;
		
		a = new Person("ȫ   �浿", 60);
		b = new Person("��  ��   ��", 40);
		
		a.view();
		b.view();
		
		a.setName("��  ȣ  ��");
		a.setAge(200);
		b.setAge(-20);
		
		a.view();
		b.view();
	}

}
