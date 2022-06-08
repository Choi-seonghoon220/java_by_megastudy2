package test18;

public class Person {
		String name;
		int age;
		
		Person(String name, int age){
			this.name = name.replaceAll("\\s+", "");
			this.age = age;
		}
		
		void setName(String name) {
			this.name = name.replaceAll("\\s+", "");
		}
		
		void setAge(int age) {
			if (age >= 1 && age <= 100)
				this.age = age;
		}
		
		void view() {
			System.out.printf("�̸� : %s, ���� : %d\n", this.name, this.age);
		}

}
