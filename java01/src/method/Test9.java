package method;

public class Test9 {

	public static void main(String[] args) {
		String a, b, c, d;
		
		a = animal("����") + " ";
		b = animal("����") + " ";
		c = animal("����") + " ";
		d = animal("�����") + " ";
		
		System.out.println(a + b + c + d);
	}
	
	static String animal(String kind) {
		String result = "";
		
		if (kind == "����")
			result = "lion";
		else if (kind == "����")
			result = "wolf";
		else if (kind == "����")
			result = "fox";
		
		return result;
	}
}
