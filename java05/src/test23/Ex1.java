package test23;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Score> list;
		
		list = new ArrayList<Score>();
		
		list.add(new Score("������", 50, 90, 70));
		list.add(new Score("����ȯ", 100, 50, 90));
		list.add(new Score("�����", 80, 60, 50));
		list.add(new Score("���ؿ�", 90, 90, 60));
		
		view(list);
	}

	static void view(ArrayList<Score> list) {
		System.out.println("�̸�      ����  ����   ����    ����    ���");
		System.out.println("=========================");
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).view();
		}
	}
}
