package test14_OXif로마지막건안들어가게도가능;

public class Test {

	public static void main(String[] args) {
		Data data = new Data();
		data.view(10, 20, 30, 5);
		data.view(1, 2, 3, 4, 5);
		data.view("홍길동", "문남식");
		data.view("kim", "mun", "lee", "park", "hong");
	}
}
