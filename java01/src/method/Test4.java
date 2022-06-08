package method;

public class Test4 {

	public static void main(String[] args) {
		bigo(40);
		bigo(70);
		bigo(90);
	}
	
	static void bigo(int score) {
		String result;
		
		if (score >= 80)
			result = "»ó";
		else if (score >= 50)
			result = "Áß";
		else
			result = "ÇÏ";
		
		System.out.println(result);
	}

}
