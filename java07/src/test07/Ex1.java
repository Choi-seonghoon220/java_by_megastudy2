package test07;

public class Ex1 {

	public static void main(String[] args) {
		int[] intArr = { 3, 4, 5, 6, 7 };
		String[] strArr = { "kim", "mun", "lee", "park", "hong" };
		String st1, st2;
		
		st1 = MyString.join(intArr, ',');
		st2 = MyString.join(strArr, '-');
		
		System.out.println(st1);
		System.out.println(st2);
	}

}
