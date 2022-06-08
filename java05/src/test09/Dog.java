package test09;

public class Dog {
	String type;
	
	Dog(String type){
		this.type = type;
	}
	
	void bark() {
		if (this.type == "¸»Æ¼Áî")
			System.out.println("¸Û¸Û");
		else if (this.type == "Çªµé")
			System.out.println("¿Ð¿Ð");
		else if (this.type == "¼¼ÆÛµå")
			System.out.println("ÄÈÄÈ");
	}
}
