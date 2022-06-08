package ex11;

public class Wolf extends AnimalAdapter {
	public Wolf(String name, int age) {
		super(name, age);
	}
	@Override
	public void bark() {
		System.out.println("아우~~~");
	}
	@Override
	public void view() {
		System.out.println("늑대 정보");
		System.out.printf("이름 : %s 나이 : %d\n", this.name, this.age);
	}
}
