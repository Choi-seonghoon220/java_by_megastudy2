package package_class_ex2;

public class Ex2 {

	public static void main(String[] args) {
		Person p1, p2;
		
		p1 = new Person();
		p2 = new Person();
		
		p1.setValue("홍길동",  60);
		p2.setValue("강동원",  30);
		
		Person.printTitle(20);
		p1.print();
		
		Person.caption_str = "*";
		Person.printTitle(30);
		p2.print();
	}

}
