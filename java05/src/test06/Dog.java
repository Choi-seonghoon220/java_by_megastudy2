package test06;

public class Dog {
	int count;
	
	Dog(int count){
		this.count = count;
	}
	
	void bark() {
		for (int i = 0; i < this.count; i++) {
			System.out.print("¸Û¸Û ");
		}
		System.out.println();
	}
}
