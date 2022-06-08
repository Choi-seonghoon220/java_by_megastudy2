package ex10;

public class Test {

	public static void main(String[] args) {
		Info[] arr = { new Info("홍길동", 60), new Info("강성범", 40) };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name + " " + arr[i].age);
		}
	}

}
