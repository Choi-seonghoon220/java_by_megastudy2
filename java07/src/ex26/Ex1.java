package ex26;

public class Ex1 {

	public static void main(String[] args) {
		byte a = 10;
		
		proce(a);	//proce(byte) -> proce(short) -> proce(int) 순으로 검색
		proce(5);
	}
	static void proce(int a) {
		System.out.println("int");
	}
	static void proce(short a) {
		System.out.println("short");
	}
}
