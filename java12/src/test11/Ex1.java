package test11;

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
}
