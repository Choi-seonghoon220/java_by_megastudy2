package test12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		Data[] arr = { new Data("ȫ�浿", 60),
						new Data("������", 30),
						new Data("�����", 20),
						new Data("���ҿ�", 23),
						new Data("������", 16) };
		
		List<Data> list = Arrays.asList(arr);
		
		System.out.println("���̼����� ����....");
		list.sort((a, b) -> a.age < b.age ? -1 : 0);
		view(arr, System.out::println);
		
		System.out.println("�̸������� ����....");
		list.sort((a, b) -> a.name.compareTo(b.name));
		view(arr, System.out::println);
	}
	
	static void view(Data[] arr, Consumer func) {
		for (Data v : arr) {
			func.accept(v);
		}
	}
}
class Data{
	String name;
	int age;
	
	Data(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + " " + this.age;
	}
}