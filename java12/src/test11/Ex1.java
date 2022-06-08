package test11;

public class Ex1 {
	
	public static void main(String[] args) {
		Data[] arr = { new Data("홍길동", 60),
						new Data("문남식", 30),
						new Data("김길춘", 20),
						new Data("유소영", 23),
						new Data("김형석", 16) };
		
		System.out.println("나이순으로 정렬....");
		sort(arr, (a, b) -> a.age < b.age);
		view(arr, System.out::println);
		
		System.out.println("이름순으로 정렬....");
		sort(arr, (a, b) -> a.name.compareTo(b.name) < 0);
		view(arr, System.out::println);
	}
}
