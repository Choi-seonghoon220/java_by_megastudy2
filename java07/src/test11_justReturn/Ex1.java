package test11_justReturn;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { "ȫ�浿", "�̰Ǳ�", "������", "���ֿ�", "������" };
		int[] score = { 100, 60, 40, 50, 60 };
		
		int idx;
		
		idx = MyArray.find(arr, "������");
		
		if (idx >= 0) {
			System.out.println(score[idx]);
		} else {
			System.out.println("ã�� ���� �����ϴ�.");
		}
	}

}
