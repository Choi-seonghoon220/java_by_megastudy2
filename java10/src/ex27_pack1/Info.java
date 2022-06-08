package ex27_pack1;

public class Info {
	public static int x = 10;	// 정적필드
	public int y = 20;			// 인스턴스 필드
	
	public Info() {
		this.x = 20;
		this.y = 30;
		this.mA();
		this.mC();
	}
	
	// 정적 메소드
	public static void mA() {
		x = 20;
//		this.y = 30;
//		y = 30;
		mB();
//		mC();
	}
	
	// 정적 메소드
	public static void mB() {
		
	}
	
	// 인스턴스 메소드
	public void mC() {
		
	}
	
	// 인스턴스 메소드
	public void mD() {
		this.x = 20;
		this.y = 10;
		this.mB();
		this.mC();
	}
}
