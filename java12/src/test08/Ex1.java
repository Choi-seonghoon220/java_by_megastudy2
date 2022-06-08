package test08;

import java.util.function.BinaryOperator;

public class Ex1 {

	public static void main(String[] args) {
		Data[] arr = { new Data("길동", 10),
						new Data("남식", 30),
						new Data("길춘", 20),
						new Data("소용", 40) };
		
		Data data = getData(arr, (a, b) -> a.age > b.age ? a : b);
		System.out.println(data);
	}
	static Data getData(Data[] arr, BinaryOperator<Data> func) {
		Data result = arr[0];
		
		for (Data v : arr) {
			result = func.apply(result, v);
		}
		
		return result;
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