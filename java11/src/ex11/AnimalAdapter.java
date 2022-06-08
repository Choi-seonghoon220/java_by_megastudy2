package ex11;

public abstract class AnimalAdapter extends Animal implements Behavior {
	public AnimalAdapter(String name, int age) {
		super(name, age);
	}
	@Override
	public void bark() {
		System.out.println("¢�´�");
	}
	@Override
	public void sleep() {
		System.out.println("���ڴ�");
	}

}
