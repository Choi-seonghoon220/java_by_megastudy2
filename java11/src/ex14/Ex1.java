package ex14;

public class Ex1 {

	public static void main(String[] args) {
		Human objA = new My();
		//람다식 표현
		Human objB = name -> System.out.println(name + "^^");
		Human objC = name -> {
			for (int i = 1; i <= 4; i++) {
				System.out.print(name + " ");
			}
		};
		objA.view("홍길동");
		objB.view("고도희");
		objC.view("최수연");
	}

}
