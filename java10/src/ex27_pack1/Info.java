package ex27_pack1;

public class Info {
	public static int x = 10;	// �����ʵ�
	public int y = 20;			// �ν��Ͻ� �ʵ�
	
	public Info() {
		this.x = 20;
		this.y = 30;
		this.mA();
		this.mC();
	}
	
	// ���� �޼ҵ�
	public static void mA() {
		x = 20;
//		this.y = 30;
//		y = 30;
		mB();
//		mC();
	}
	
	// ���� �޼ҵ�
	public static void mB() {
		
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void mC() {
		
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void mD() {
		this.x = 20;
		this.y = 10;
		this.mB();
		this.mC();
	}
}
