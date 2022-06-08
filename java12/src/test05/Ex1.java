package test05;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Data> list = new ArrayList<>();
		
		list.add(data_build("홍길동", 60, Data::new));
		list.add(data_build("이건길", 50, Data::new));
		list.add(data_build("문남식", 30, Data::new));
		
		list.forEach(System.out::println);
	}
	static Data data_build(String str, int age, BiFunction<String, Integer, Data> func) {
		return func.apply(str, age);
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