package method;

public class Test1 {

	public static void main(String[] args) {
		print("메가", "코딩", "학원");
		print("기가", "코딩", "학원");
		print(10, 20, 30);
		print(100, 30, 40);
	}
	
	static void print(String st1, String st2, String st3) {
		System.out.println(st1 + " " + st2 + " " + st3);
		
		return;
	}
	static void print(int st1, int st2, int st3) {
		System.out.println(st1 + " " + st2 + " " + st3);
		
		return;
	}

}
