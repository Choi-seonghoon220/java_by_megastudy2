package test20_pack2;

public class Main {

	public static void main(String[] args) {
		test20_pack1.Person p = new test20_pack1.Person();
		
		p.setName("È«  ±æ µ¿");
		p.setAge(30);
		
		p.setAge(-30);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
