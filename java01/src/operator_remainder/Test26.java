package operator_remainder;

public class Test26 {

	public static void main(String[] args) {
		String str = "메가코딩컴퓨터학원";
		String exStr ="";
		
		for (int i = 0; i < str.length(); i++) {
//			exStr = exStr + str.charAt(str.length() - i - 1);
			exStr = str.charAt(i) + exStr;
		}
		System.out.println(exStr);
	}
}
