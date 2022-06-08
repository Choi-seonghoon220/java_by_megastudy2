package pack8;

public class Ex2 {

	public static void main(String[] args) {
		String gen = "girl";
		
		if (gen.equals("man") || gen.equals("boy"))
		{
			System.out.println("남자");
		}
		else if (gen.equals("woman") || gen.equals("girl"))
		{
			System.out.println("여자");
		}
		else
		{
			System.out.println("???");
		}
	}

}
