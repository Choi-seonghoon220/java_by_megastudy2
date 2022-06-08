package method;

public class Test9 {

	public static void main(String[] args) {
		String a, b, c, d;
		
		a = animal("사자") + " ";
		b = animal("늑대") + " ";
		c = animal("여우") + " ";
		d = animal("고양이") + " ";
		
		System.out.println(a + b + c + d);
	}
	
	static String animal(String kind) {
		String result = "";
		
		if (kind == "사자")
			result = "lion";
		else if (kind == "늑대")
			result = "wolf";
		else if (kind == "여우")
			result = "fox";
		
		return result;
	}
}
