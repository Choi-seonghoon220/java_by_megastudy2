package ex18;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ȫ�浿");
		list.add("�̹α�");
		list.add("������");
		
		//list.forEach(new Comp());
		//list.forEach(s -> System.out.println(s));
		list.forEach(System.out::println);
		
		list.forEach(name -> System.out.printf("%s�� �ȳ��ϼ���.\n", name));
		
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(4);
		integerList.add(3);
		integerList.add(2);
		integerList.forEach(num -> {
			int tot = 0;
			for (int i = 0; i < 3; i++) {
				tot += num;
			}
			
			System.out.println(tot);
		});
		
	}
}
//class Comp implements Consumer<String> {
//	public void accept(String st) {
//		System.out.println(st);
//	}
//}

