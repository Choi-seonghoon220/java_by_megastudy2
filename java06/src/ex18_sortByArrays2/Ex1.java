package ex18_sortByArrays2;

import java.util.Arrays;
import java.util.Comparator;
//Comparator는 인터페이스
//인터페이스는 메소드만 정의되어있고 내부 코드는 안 짜여있다.
//내 입맛대로 메소드를 짜주기 위한 것

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
//빨간 줄 떴을 때 Ctrl + 1 누르면 등록되어있는 메소드가 나온다.
	
	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}
	
}