package ex25_2methodOverloading;

public class Ex1 {

	public static void main(String[] args) {
		view(10);
		view("gil dong");
		view(new int[] { 4, 5, 6, 7 });
	}
	static void view(int a) {
		System.out.println("Integer func : " + a);
	}
	static void view(String str) {
		System.out.println("String func : " + str);
	}
	static void view(int[] arr) {
		System.out.println("int[] func");
	}
}
