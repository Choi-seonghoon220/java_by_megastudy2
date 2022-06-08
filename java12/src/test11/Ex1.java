package test11;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Ex1 {
	
	public static void main(String[] args) {
		Data[] arr = { new Data("ȫ�浿", 60),
						new Data("������", 30),
						new Data("�����", 20),
						new Data("���ҿ�", 23),
						new Data("������", 16) };
		
		System.out.println("���̼����� ����....");
		sort(arr, (a, b) -> a.age < b.age);
		view(arr, System.out::println);
		
		System.out.println("�̸������� ����....");
		sort(arr, (a, b) -> a.name.compareTo(b.name) < 0);
		view(arr, System.out::println);
	}
	static void sort(Data[] arr, BiPredicate<Data, Data> func) {
		Data temp;
		
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			
			int j = i - 1;
			
			while (j >= 0 && func.test(temp, arr[j])) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
	static void view(Data[] arr, Consumer func) {
		for (Data v : arr) {
			func.accept(v);
		}
	}
}
class Data {
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