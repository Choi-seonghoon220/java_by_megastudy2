package ex01;

public class Ex1 {

	public static void main(String[] args) {
		Eagle eagle = new Eagle("±î¹Ì", 40);
		Dog dog = new Dog("¶ÊÀÌ", "Çªµé");
		
		eagle.eat();
		eagle.fly();
		
		dog.eat();
		dog.bark();
		
		System.out.println(dog.toString());
	}

}
