package test11_justReturn;

public class Ex1 {

	public static void main(String[] args) {
		String[] arr = { "홍길동", "이건길", "문남식", "김주완", "박지원" };
		int[] score = { 100, 60, 40, 50, 60 };
		
		int idx;
		
		idx = MyArray.find(arr, "문남식");
		
		if (idx >= 0) {
			System.out.println(score[idx]);
		} else {
			System.out.println("찾을 수가 없습니다.");
		}
	}

}
