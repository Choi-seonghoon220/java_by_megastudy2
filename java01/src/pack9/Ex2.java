package pack9;

public class Ex2 {

	public static void main(String[] args) {
		String gen;
		int score;
		
		gen = "����";
		score = 90;
		
		if (!gen.equals("����") && score >= 90)
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
	}

}
