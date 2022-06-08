package ex23;

public class Person {
	private String name = "홍길동";
	
	private String info() {
		return "이름 = " + this.name;
	}
	public void view() {
		//클래스 멤버끼리는 참조가능
		System.out.println(this.info());
	}
}
