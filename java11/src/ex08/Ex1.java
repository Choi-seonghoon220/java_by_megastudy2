package ex08;

public class Ex1 {

	public static void main(String[] args) {
		StudentA a = new StudentA();
		StudentA b = new StudentA();
		
		a.ban = 1;
		a.num = 10;
		
		b.ban = 1;
		b.num = 10;
		
		if (a.equals(b)) {
			System.out.println("match");
		} else {
			System.out.println("mismatch");
		}
		
		StudentB c = new StudentB(1, 10);
		StudentB d = new StudentB(1, 10);
		
		if (c.equals(c)) {
			System.out.println("match");
		} else {
			System.out.println("mismatch");
		}
        
		if (c.equals("메가")) {
			System.out.println("메가코딩컴퓨터학원");
		}
	}

}
