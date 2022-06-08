package ex04;

public class Ex1 {

	public static void main(String[] args) {
		Info[] arr = new Info[4];
		
		arr[0] = new Info();
		arr[1] = new Info();
		arr[2] = new Info();
		
		arr[0].name = "홍길동";
		arr[0].age = 60;
		arr[1].name = "이건길";
		arr[1].age = 20;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i].name + " " + arr[i].age);
		}
	}
}
