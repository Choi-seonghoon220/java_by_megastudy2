package ex3_2;

import java.util.function.BiFunction;

public class Ex1 {

	public static void main(String[] args) {
		BiFunction<String, Integer, Data> func = (name, age) -> new Data(name, age);
//		BiFunction<String, Integer, Data> func = Data::new;
		
		Data data = func.apply("ȫ�浿", 60);
		System.out.println(data);
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