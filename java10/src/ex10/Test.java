package ex10;

public class Test {

	public static void main(String[] args) {
		Info[] arr = { new Info("ȫ�浿", 60), new Info("������", 40) };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name + " " + arr[i].age);
		}
	}

}
