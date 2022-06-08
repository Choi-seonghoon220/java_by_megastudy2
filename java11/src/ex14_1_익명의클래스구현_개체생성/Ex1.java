package ex14_1_劳疙狼努贰胶备泅_俺眉积己;

public class Ex1 {

	public static void main(String[] args) {
		Human obj = new Human() {
			public void view(String st) {
				System.out.println(st);
			}
		};
		obj.view("全辨悼");
		
		Animal animal = new Animal() {
			String name;
			public void bark() {
				System.out.println("港港");
			}
		};
		
		
		animal.bark();
	}
}

class Animal{
	void bark() {
		System.out.println("");
	}
}