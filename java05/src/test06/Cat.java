package test06;

public class Cat {
	int count;
	
	Cat(int count){
		this.count = count;
	}
	
	void bark() {
		for (int i = 0; i < this.count; i++) {
			System.out.print("¾ß¿Ë ");
		}
		System.out.println();
	}
}
