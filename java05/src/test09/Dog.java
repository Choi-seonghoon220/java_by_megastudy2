package test09;

public class Dog {
	String type;
	
	Dog(String type){
		this.type = type;
	}
	
	void bark() {
		if (this.type == "��Ƽ��")
			System.out.println("�۸�");
		else if (this.type == "Ǫ��")
			System.out.println("�п�");
		else if (this.type == "���۵�")
			System.out.println("����");
	}
}
