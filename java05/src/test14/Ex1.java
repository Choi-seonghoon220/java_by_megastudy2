package test14;

public class Ex1 {
    
	public static void main(String[] args) {
		Score a, b;
		Ex1 obj = new Ex1();
		
		a = obj.func("홍길동", 50);
		b = obj.func("문남식", 90);
		
		a.view();
		b.view();
	}
	
	 Score func(String name, int score){
		Score test = new Score(name, score);
		return test;
	}

}
