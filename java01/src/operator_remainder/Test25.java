package operator_remainder;

public class Test25 {

	public static void main(String[] args) {
		String str = "메가코딩컴퓨터학원";
		String exStr ="";
		
		for (int i = 0; i < str.length(); i++) {
			exStr = exStr + str.charAt(i);
			
			if (i != str.length() - 1) {
				exStr = exStr + ",";
			}
		}
		System.out.println(exStr);
	}

}
