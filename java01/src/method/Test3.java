package method;

public class Test3 {

	public static void main(String[] args) {
		color("����");
		color("�Ķ�");
		color("���");
		color("����");
	}
	
	static void color(String rgb) {
		String result = "do not know";
		
		if (rgb == "����")
			result = "red";
		else if (rgb == "�Ķ�")
			result = "blue";
		else if (rgb == "���")
			result = "yellow";
		
		System.out.println(result);
	}
}
