package test05;

public class Test {

	public static void main(String[] args) {
		Info[] arr = { new Info("�浿", 60), new Info("�Ǳ�", 70), new Info("����", 55) };
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].view();
		}
	}

}
