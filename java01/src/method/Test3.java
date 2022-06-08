package method;

public class Test3 {

	public static void main(String[] args) {
		color("»¡°­");
		color("ÆÄ¶û");
		color("³ë¶û");
		color("ÀÚÁÖ");
	}
	
	static void color(String rgb) {
		String result = "do not know";
		
		if (rgb == "»¡°­")
			result = "red";
		else if (rgb == "ÆÄ¶û")
			result = "blue";
		else if (rgb == "³ë¶û")
			result = "yellow";
		
		System.out.println(result);
	}
}
