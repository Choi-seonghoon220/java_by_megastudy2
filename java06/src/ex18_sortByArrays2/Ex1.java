package ex18_sortByArrays2;

import java.util.Arrays;
import java.util.Comparator;
//Comparator�� �������̽�
//�������̽��� �޼ҵ常 ���ǵǾ��ְ� ���� �ڵ�� �� ¥���ִ�.
//�� �Ը���� �޼ҵ带 ¥�ֱ� ���� ��

public class Ex1 {

	public static void main(String[] args) {
		Integer[] num = { 2, 5, 7, 9, 10, 12, 14, 15, 17, 19 };
		
		Arrays.sort(num, new Comp());
		for (int v : num) {
			System.out.print(v + " ");
		}
		
		System.out.println();
		
		Arrays.sort(num, (a, b) -> a - b);
		for (int v : num) {
			System.out.print(v + " ");
		}
	}

}

class Comp implements Comparator<Integer> {
//���� �� ���� �� Ctrl + 1 ������ ��ϵǾ��ִ� �޼ҵ尡 ���´�.
	
	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}
	
}