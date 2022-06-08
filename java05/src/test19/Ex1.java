package test19;

public class Ex1 {

	public static void main(String[] args) {
		Data a, b;
		
		a = new Data("kim", 50);
		b = new Data("Mun", 60);
		
		a.view();
		b.view();
		
		Data.nameCaption = "이름";
		Data.ageCaption = "나이";
		
		Data c = new Data("Lee", 80);
		c.view();
	}

}
