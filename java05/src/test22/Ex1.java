package test22;

public class Ex1 {

	public static void main(String[] args) {
		Score[] arr = new Score[4];
		
		arr[0] = new Score("������", 50, 90, 70);
		arr[1] = new Score("����ȯ", 100, 50, 90);
		arr[2] = new Score("�����", 80, 60, 50);
		arr[3] = new Score("���ؿ�", 90, 90, 60);
		
		view(arr);
	}
	
	static void view(Score[] arr) {
		System.out.println("�̸�      ����  ����   ����    ����    ���");
		System.out.println("=========================");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].view();
		}
	}

}
