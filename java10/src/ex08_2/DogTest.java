package ex08_2;

public class DogTest {

	public static void main(String[] args) {
		Dog dog1, dog2, dog3;
		
		dog1 = new Dog();
		dog2 = new Dog();
		dog3 = new Dog();
		
		dog1.bark();
		dog2.bark("�п�");
		dog3.bark("����", 10);
	}

}
