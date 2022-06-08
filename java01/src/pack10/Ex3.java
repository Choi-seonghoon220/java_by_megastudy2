package pack10;

public class Ex3 {

	public static void main(String[] args) {
		String name, addr, st;
		name = "홍길동";
		addr = "서울 종로구";
		
		if (addr.startsWith("서울"))
			st = name + "씨는 서울에서 사시네요.";
		else if (addr.startsWith("부산"))
			st = name + "씨는 부산에서 사시네요.";
		else
			st = name + "씨 어디서 사시나요?";
		
		System.out.println(st);
	}

}
