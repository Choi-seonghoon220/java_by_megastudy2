package ex27_genericMethod;

public class Ex1 {

	public static void main(String[] args) {
		view(10);
		view("gil dong");
		view(new int[] { 4, 5, 6, 7 });
	}
	static <T>void view(T a) {
		if (a instanceof int[]) {
			System.out.println("int[]");
		} else {
			System.out.println(a);
		}
	}

}
