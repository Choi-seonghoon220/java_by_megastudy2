package test05;

public class Test {

	public static void main(String[] args) {
		Info[] arr = { new Info("길동", 60), new Info("건길", 70), new Info("남식", 55) };
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].view();
		}
	}

}
