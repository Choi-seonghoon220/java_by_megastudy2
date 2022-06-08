package operator_remainder;

public class Test27 {

	public static void main(String[] args) {
		String str = "Mega,giga,Tera";
		String exStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ',') {
				exStr = exStr + " " + str.charAt(i);
			}
			else
				exStr = exStr + str.charAt(i);
		}
		
		exStr = exStr.trim();
		System.out.println(exStr);
	}

}
