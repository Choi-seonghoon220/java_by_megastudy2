package package_class_ex1;

public class Ex1 {
	
	public static void main(String[] args) {
		Person p1, p2;
		
		p1 = new Person();
		p2 = new Person();
		
		p1.name = "È«±æµ¿";
		p1.age = 50;

		p2.name = "°­µ¿¿ø";
		p2.age = 30;
		
		Person.view_bar();
		p1.view();
		p1.view_bar();
		System.out.println(p1.max_age);
		System.out.println(Person.max_age);
		
		Person.view_bar();
		p2.view();
		
		Animal ani;
		
		ani = new Animal();
		ani.name = "´Üºñ";
		
		ani.view("Çªµé");
	}

}
